package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Group1316 {

	static 	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
	
		int n = Integer.parseInt(bf.readLine());
		int count = 0;
		
		for(int i=0; i<n; i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int pre = 0;
		String s = bf.readLine();
		
		for(int i=0; i<s.length(); i++) {
			int now = s.charAt(i); // ���� ���� ����
			
			if(pre != now) { // ���� ���ڿ� i��° ���ڰ� ���� ������
				if(check[now-'a'] == false) { // �ش� ���ڰ� ó�� ������ ���
					check[now-'a'] = true;
					pre = now;
				} else { // �ش� ���ڰ� �̹� ��������(�׷�ܾ�x)
					return false;
				}
			}
		}
		return true;
	}

}
