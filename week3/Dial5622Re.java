package week3;
/*
 *  else-if������ ���� ����Ǽ��� �������� ���� �����ִ°� ������
 *  */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial5622Re {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String s = bf.readLine();
		int sum=0;
		char [] arr = new char [26];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (char)(65+i); // 'A' ~
			
			for(int j=0; j<s.length(); j++) {
				char c = s.charAt(j);
				if(arr[i] == c) {
					if(i == 25) { // Z�� 4���̴�
						sum += 10;
					} else if(i >= 18) { // R���� 3���� ���̴� ��Ģ�� ������
						sum += ((i-1)/3+3); // 18���� 17���� �Ǿ� ���� -1�� �ǰ�
					} else {
						sum += (i/3+3); // ABC�� 0+3, DEF�� 1+3 ...
					}
				}
			}
		}
		System.out.println(sum);
	}
}
