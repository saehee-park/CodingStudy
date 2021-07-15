package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlpNum10808 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		
		int [] count = new int[26];
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			for(int j = 'a'; j<='z'; j++) {
				if(c == j) {
					count[c-'a']++; // a=97, b=98
				}
			}
		}
		for(int i : count) {
			System.out.print(i+" ");
		}
	}
}