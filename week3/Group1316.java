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
			int now = s.charAt(i); // 현재 문자 저장
			
			if(pre != now) { // 이전 문자와 i번째 문자가 같지 않으면
				if(check[now-'a'] == false) { // 해당 문자가 처음 나오는 경우
					check[now-'a'] = true;
					pre = now;
				} else { // 해당 문자가 이미 나왔으면(그룹단어x)
					return false;
				}
			}
		}
		return true;
	}

}
