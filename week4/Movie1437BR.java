package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Movie1437BR {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int six = 666;
		int count =0;
		
		while(count != n) { // �ԷµǴ� n��° ���� �ƴϸ� ����ؼ� ����
			int num = six;
			int count666 = 0;
			
			while(num>0) {
				if(num%10 == 6) { // 10���� ���� �������� 6�ΰ�� ī��Ʈ666
					count666++;
				} else { // 6�� ���������� ������ �ʴ´ٸ� count �ٽ� 0����
					count666 = 0;
				}
				num /= 10;
				if(count666 >= 3) { // 6�� 3�� ī���õ����� �� �� ���
					count++;
					break;
				}
			}
			six++;
		}
		System.out.println(six-1);
	}
}
