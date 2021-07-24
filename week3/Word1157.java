package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word1157 {

public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bf.readLine().toUpperCase(); // �빮�� ��ȯ
		int [] count = new int[26]; // ���ĺ� ���� ��ŭ
		int max=0;
		char maxAl = ' ';
		
		for(int i=0; i<s.length(); i++) {
			count[s.charAt(i)-'A']++;
	
			if(max<count[s.charAt(i)-'A']) {
				max = count[s.charAt(i)-'A'];
				maxAl = s.charAt(i);
			} else if(max == count[s.charAt(i)-'A']) {
				maxAl = '?';
			}
		}
		System.out.print(maxAl);
		bf.close();
	}
}
