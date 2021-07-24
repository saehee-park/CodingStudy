package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumSum11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int sum = 0;
		
		String num = bf.readLine();
		
		for(int i=0; i<n; i++) {
			sum = sum + num.charAt(i)-'0';
		}
		
		System.out.print(sum);
		bf.close();
	}
}
