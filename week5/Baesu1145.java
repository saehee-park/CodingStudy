package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baesu1145 {

public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int [] arr = new int [5];
		int min = 100; // 100���� ���� �ڿ���
		
		st = new StringTokenizer(bf.readLine(), " ");
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		int count = 0;
		while(true) {
			for(int i=0; i<5; i++) {
				if(min%arr[i] == 0) {
					count++;
				}
			}
			if(count>=3) {
				break; // ��� ������ �������� Ż��
			}
			
			count = 0; // �ʱ�ȭ
			min++; // �ּҰ����� �ϳ��� �ø���
		}
		System.out.println(min);
	}

}
