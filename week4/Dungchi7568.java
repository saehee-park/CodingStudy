package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dungchi7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[][] info = new int[n][2];

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			info[i][0] = Integer.parseInt(st.nextToken()); // x ������
			info[i][1] = Integer.parseInt(st.nextToken()); // y Ű
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			int rank = 1;
			
			for(int j=0; j<n; j++) {
				if(i==j) { // ���� ����� ���� �ʿ䰡 ����
					continue;
				}
				// i��° ����� j��° ����� ���Ͽ� i<j �ϰ�� j�� rank�� ����
				if(info[i][0] < info[j][0] && info[i][1] < info[j][1]) {
					rank++;
				}
			}
			
			sb.append(rank).append(' ');
		}
		System.out.println(sb);
	}

}
