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
		
		Arrays.sort(result, (e1, e2) -> { // 람다식
			if(e1[1] == e2[1]) { // 첫번째 원소가 같다면 두번째 원소끼리 비교
				return e1[0] - e2[0]; // e1<e2면 음수값 | 같다면 0 | e1>e2면 양수값
			} else {                  // 두 원소의 대소 비교값을 쉽게 이해하기 위해 사용 이 정보를 통해 어떤 원소가 
				return e1[1] - e2[1]; // 우선순위가 높은지 알아내고 두 원소이 위치를바꿀지말지 Arrays가 결정
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(result[i][0]+" "+result[i][1]).append('\n');
		}
		System.out.println(sb);
	}

}
