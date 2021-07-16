package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Card11652 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		int [] result = new int[n];
		int count = 0;
		int newcount = 0;
		for(int i=0; i<n; i++) {
			result[i] = Integer.parseInt(bf.readLine());
		}
		int num = result[0];
		Arrays.sort(result);
		
		for(int i=0; i<n-1; i++) { // ������ ���� �������� �յ� ������ Ȯ��
			if(result[i] == result[i+1]) {
				newcount ++;
			} else {
				newcount = 0; // �ƴϸ� �׳� �Ѿ
			}
			
			if(count < newcount) { // ������ count������ ũ�ٸ�
				count = newcount; // count���� �ִ밪���� �ٽ� ����
				num = result[i]; // �� ���� ����
			}
		}
		System.out.println(num);
	}

}
