package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pallee1212 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			String a = Integer.toBinaryString(s.charAt(i)-'0'); // ������ ��ȯ
			if(a.length()==2 && i!=0) { // ������ ��ȯ ���̰� 2�̰� ���� ù��° ���ڰ� �ƴϸ�
				a = "0"+a; // 0 ä���ֱ�
			} else if (a.length()==1 && i!=0) {
				a = "00"+a;
			}
			sb.append(a);
		}
		System.out.println(sb);
	}
}
