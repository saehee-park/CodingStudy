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
			info[i][0] = Integer.parseInt(st.nextToken()); // x 몸무게
			info[i][1] = Integer.parseInt(st.nextToken()); // y 키
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			int rank = 1;
			
			for(int j=0; j<n; j++) {
				if(i==j) { // 같은 사람은 비교할 필요가 없음
					continue;
				}
				// i번째 사람과 j번째 사람을 비교하여 i<j 일경우 j의 rank값 증가
				if(info[i][0] < info[j][0] && info[i][1] < info[j][1]) {
					rank++;
				}
			}
			
			sb.append(rank).append(' ');
		}
		System.out.println(sb);
	}

}
