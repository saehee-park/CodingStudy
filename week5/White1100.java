package week5;

import java.util.Scanner;

public class White1100 {
	
	static char[][] map;
	static boolean[][] color;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		map = new char[8][8]; // ������ ��ġ

		// ü����-����̸� false, �������̸� true
		color = new boolean[8][8];

		boolean flag = true;
		
		for (int i = 0; i < 8; i++) {
			String input = sc.next();
			if (i % 2 == 0) // ¦���� ����
				flag = false;
			else
				flag = true;

			for (int j = 0; j < 8; j++) {
				map[i][j] = input.charAt(j);
				color[i][j] = flag;
				flag = !flag;
			}
		}

		// ���� ���� �����ϴ� �迭 ĭ count
		int count = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (color[i][j] == false && map[i][j] == 'F')
					count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
