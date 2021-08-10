package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Woondong1173 {
	
	static int N, m, M, T, R;

public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken()); // 운동 시간
		m = Integer.parseInt(st.nextToken()); // 최소백박
		M = Integer.parseInt(st.nextToken()); // 최대맥박
		T = Integer.parseInt(st.nextToken()); // 운동-증가 맥박
		R = Integer.parseInt(st.nextToken()); // 휴식-감소 맥박
		
		if(M<T+m) { // 운동  N분 할 수 없을 때
			System.out.println(-1);
		} else {
			exercise(0,0,m);
		}
		
	}

    // 재귀
	private static void exercise(int time, int n, int X) {
		if(n == N) {
			System.out.println(time);
		} else {
			if(X+T<=M) { // 운동
				exercise(time+1, n+1, X+T);
			} else { // 휴식
				if(X-R<m) { // 최저 맥박(m)보다 작아질때
					exercise(time+1, n, m);
				} else {
					exercise(time+1, n, X-R);
				}
			}
		}
	}
}
