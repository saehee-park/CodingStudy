package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Jeopsort11656 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int length = s.length();
		
		String [] split = new String[length];
		for(int i=0; i<length; i++) {
			split[i] = s.substring(i); // substring i번째부터 모두 출력하겠다
		}
		
		Arrays.sort(split);
		for(String i : split) {
			System.out.print(i+"\n");
		}

	}
}
