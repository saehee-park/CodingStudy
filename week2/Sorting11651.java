package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sorting11651 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		int[][] result = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			result[i][0] = Integer.parseInt(st.nextToken()); // x
			result[i][1] = Integer.parseInt(st.nextToken()); // y
		}
		
		Arrays.sort(result, (e1, e2) -> { // ���ٽ�
			if(e1[1] == e2[1]) { // ù��° ���Ұ� ���ٸ� �ι�° ���ҳ��� ��
				return e1[0] - e2[0]; // e1<e2�� ������ | ���ٸ� 0 | e1>e2�� �����
			} else {                  // �� ������ ��� �񱳰��� ���� �����ϱ� ���� ��� �� ������ ���� � ���Ұ� 
				return e1[1] - e2[1]; // �켱������ ������ �˾Ƴ��� �� ������ ��ġ���ٲ������� Arrays�� ����
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(result[i][0]+" "+result[i][1]).append('\n');
		}
		System.out.println(sb);
	}

}
