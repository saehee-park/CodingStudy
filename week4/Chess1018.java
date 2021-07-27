package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess1018 {
	
	public static boolean[][] arr;
	public static int min = 64;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		arr = new boolean[n][m]; // true:W, false:B
		
		for(int i=0; i<n; i++) {
			String s = bf.readLine();
			
			for(int j=0; j<m; j++) {
				if(s.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
		int nRow = n-7; // 가로, 최소 크기가 8일때 경우의수가 1이라 n-7하는것
		int mCol = m-7; // 세로
		
		for(int i=0; i<nRow; i++) {
			for(int j=0; j<mCol; j++) {
				find(i,j);
			}
		}
		System.out.println(min);
	}

	private static void find(int x, int y) {
		int endX = x+8;
		int endY = y+8;
		int count = 0; // 첫번째 칸을 기준으로 할때 색칠할 개수
		
		boolean TF = arr[x][y]; // 첫번째 칸의 색
		
		for(int i=x; i<endX; i++) {
			for(int j=y; j<endY; j++) {
				if(arr[i][j] != TF) { // 올바른 색이 아닐 경우
					count++;
				}
				// 다음 칸은 색이 바뀌므로 반대로 값을 변경
				TF = (!TF);
			}
			TF = !TF;
		}
		
		// 64-count : 첫번째 칸의 색과 반대되는 색을 기준으로 할때의 색칠할개수
		// 두가지중 최솟값 count에 저장
		count = Math.min(count,  64-count);
		
		// 이전까지의 경우 중 최솟값보다 count 값이 더 작으면 갱신
		min = Math.min(min, count);
	}

}
