package week4;

import java.util.Scanner;

public class Turet1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			System.out.println(marin(x1, y1, r1, x2, y2, r2));
		}
		sc.close();
	}

	private static int marin(int x1, int y1, int r1, int x2, int y2, int r2) {

		int distancepow = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); // ������ �Ÿ� ������
		
		// case1 : ������ �����鼭 �������� ���� ��� (��ĥ���)
		if(x1 == x2 && y1==y2 && r1==r2) {
			return -1; // ��ġ�� ���� ���Ѵ�
		}
		
		// case2-1 : �� ���� ������ �պ��� ������ �Ÿ��� �� �涧 (��ġ��������)
		else if(distancepow > Math.pow(r1+r2, 2)) {
			return 0;
		}
		
		// case2-2 : ���ȿ� ���� ������ �������� ������ (��ġ��������)
		else if(distancepow < Math.pow(r1-r2, 2)) {
			return 0;
		}
		
		// case3-1 : �����Ҷ�
		else if(distancepow == Math.pow(r1-r2, 2)) {
			return 1;
		}
		
		// case3-2 : �����Ҷ�
		else if(distancepow == Math.pow(r1+r2, 2)) {
			return 1;
		}
		
		else { // �� ������ �ƴ϶�� ������ �ΰ���
			return 2;
		}
	}

}
