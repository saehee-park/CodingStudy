package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlpFind10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		
		int [] count = new int[26];
		
		for(int i=0; i<count.length; i++) {
			count[i] = -1; // 초기화
		}
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(count[c-'a'] == -1) { // -1때만 초기화
				count[c-'a'] = i;
			}
		}
		
		for(int i : count) {
			System.out.print(i+" ");
		}
	}
}