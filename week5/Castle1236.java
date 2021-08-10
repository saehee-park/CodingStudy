package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Castle1236 {

public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken()); // ����
		int M = Integer.parseInt(st.nextToken()); // ����
		int row = 0;	// ��
		int col = 0;	// ��
		char[][] map = new char[N][M];
		
		for(int i=0; i<map.length; i++) {
			String str = br.readLine();
			for(int j=0; j<map[i].length; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		// �࿡ �ʿ��� ���� ��
		for(int i=0; i<N; i++) {
			boolean flag = true;
			for(int j=0; j<M; j++) {
				if(map[i][j] == 'X') {
					flag = false;
					break;
				}
			}
			if(flag)
				row ++; // �࿡ �ʿ��� ���� �� ����
		}
		
		// ���� �ʿ��� ���� ��
		for(int i=0; i<M; i++) {
			boolean flag = true;
			for(int j=0; j<N; j++) {
				  if(map[j][i] == 'X') {
					  flag = false;
					  break;
				  }
			}
			if(flag)
				col ++; // ���� �ʿ��� ���� �� ����
		}
		
		// ��, �� �� �ִ밪 ���� �� ���� ������ �߰�
		System.out.println(Math.max(row, col));
	}
}
