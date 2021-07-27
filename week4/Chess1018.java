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
		
		int nRow = n-7; // ����, �ּ� ũ�Ⱑ 8�϶� ����Ǽ��� 1�̶� n-7�ϴ°�
		int mCol = m-7; // ����
		
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
		int count = 0; // ù��° ĭ�� �������� �Ҷ� ��ĥ�� ����
		
		boolean TF = arr[x][y]; // ù��° ĭ�� ��
		
		for(int i=x; i<endX; i++) {
			for(int j=y; j<endY; j++) {
				if(arr[i][j] != TF) { // �ùٸ� ���� �ƴ� ���
					count++;
				}
				// ���� ĭ�� ���� �ٲ�Ƿ� �ݴ�� ���� ����
				TF = (!TF);
			}
			TF = !TF;
		}
		
		// 64-count : ù��° ĭ�� ���� �ݴ�Ǵ� ���� �������� �Ҷ��� ��ĥ�Ұ���
		// �ΰ����� �ּڰ� count�� ����
		count = Math.min(count,  64-count);
		
		// ���������� ��� �� �ּڰ����� count ���� �� ������ ����
		min = Math.min(min, count);
	}

}
