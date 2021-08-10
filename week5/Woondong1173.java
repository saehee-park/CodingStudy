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
		
		N = Integer.parseInt(st.nextToken()); // � �ð�
		m = Integer.parseInt(st.nextToken()); // �ּҹ��
		M = Integer.parseInt(st.nextToken()); // �ִ�ƹ�
		T = Integer.parseInt(st.nextToken()); // �-���� �ƹ�
		R = Integer.parseInt(st.nextToken()); // �޽�-���� �ƹ�
		
		if(M<T+m) { // �  N�� �� �� ���� ��
			System.out.println(-1);
		} else {
			exercise(0,0,m);
		}
		
	}

    // ���
	private static void exercise(int time, int n, int X) {
		if(n == N) {
			System.out.println(time);
		} else {
			if(X+T<=M) { // �
				exercise(time+1, n+1, X+T);
			} else { // �޽�
				if(X-R<m) { // ���� �ƹ�(m)���� �۾�����
					exercise(time+1, n, m);
				} else {
					exercise(time+1, n, X-R);
				}
			}
		}
	}
}
