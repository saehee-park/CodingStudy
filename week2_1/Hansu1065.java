package week2_1;
/*
 * �����ڸ��� �����ڸ��� ������ ���������� ���� (1-99) */
import java.util.Scanner;

public class Hansu1065 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int han = 0;
		int[] dc = new int[3]; // ��������
		
		if(n<100) {
			han = n;
		} else if(n == 1000) {
			han = 144; // 1000�� 999�� �־����� ���� ������ ó��
		} else { // ���ڸ����� ���ؼ��� ����
			han = 99;
			for(int i=100; i<=n; i++) {
				int j = 0;
				int l = i;
				while(l>0) {
					dc[j] = l%10;
					l = l/10;
					j++;
				}
				if(dc[0] - dc[1] == dc[1] - dc[2]) { // ���������̸�
					han++;
				}
			}
			
		}
		System.out.println(han);
		scanner.close();
	}

}
