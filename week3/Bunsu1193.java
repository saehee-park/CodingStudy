package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bunsu1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int cross = 1; // �ش� ������ �밢�� ����
		int sum = 0; // 1���� ���� �밢�� ������ ���� ����
		
		while(true) {
			
			if(n <= sum+cross) {
				
				if(cross%2 == 1) { // �и�+�������� Ȧ���� �и� ū ������
					// �и� : �밢�� ���� - (n-���� �밢�������� ���Ҵ���������-1)
					// ���� : n-����  �밢�������� �������������� > �밢������ ���ڹ�° ��ġ��
					// �밢���� ������ ����+�и��� ���� 1�� ���̰� ��
					System.out.print((cross - (n-sum-1)) +"/"+ (n-sum));
					break;
				} else { // ¦���� Ȧ���� �ݴ�� ���
					System.out.print((n-sum) +"/"+ (cross - (n-sum-1)));
					break;
				}
				
			} else {
				sum += cross;
				cross++;
			}
		}
	}
}
