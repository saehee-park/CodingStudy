package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Castle1236 {

public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); // 세로
		int M = Integer.parseInt(st.nextToken()); // 가로
		int row = 0;	// 행
		int col = 0;	// 열
		char[][] map = new char[N][M];
		
		for(int i=0; i<map.length; i++) {
			String str = br.readLine();
			for(int j=0; j<map[i].length; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		// 행에 필요한 경비원 수
		for(int i=0; i<N; i++) {
			boolean flag = true;
			for(int j=0; j<M; j++) {
				if(map[i][j] == 'X') {
					flag = false;
					break;
				}
			}
			if(flag)
				row ++; // 행에 필요한 경비원 수 증가
		}
		
		// 열에 필요한 경비원 수
		for(int i=0; i<M; i++) {
			boolean flag = true;
			for(int j=0; j<N; j++) {
				  if(map[j][i] == 'X') {
					  flag = false;
					  break;
				  }
			}
			if(flag)
				col ++; // 열에 필요한 경비원 수 증가
		}
		
		// 행, 열 중 최대값 구해 더 많은 경비원수 추가
		System.out.println(Math.max(row, col));
	}
}
