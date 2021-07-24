package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bu2775 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		int[][] info = new int[t][2];
		
		for(int i=0; i<t; i++) {
			info[i][0] = Integer.parseInt(bf.readLine()); // k��
			info[i][1] = Integer.parseInt(bf.readLine()); // nȣ
		}
		
		int[][] apart = new int[15][15]; // 0~14���� ����
		for(int i=1; i<apart.length; i++) {
			apart[0][i] = i;
		}
		
		for(int i=1; i<apart.length; i++) {
			for(int j=1; j<apart.length; j++) {
				apart[i][j] = apart[i][j-1] + apart[i-1][j]; // ��ȣ���� �Ʒ��� �����ڼ� ������
			}
		}
		
		for(int i=0; i<info.length; i++) {
			System.out.println(apart[info[i][0]][info[i][1]]);
		}
		bf.close();
	}
}
