package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial10872 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int result = 1;
		
		if(n == 0) {
			System.out.println(1);
		} else {
			while(n!=0) {
				result = result*n;
				n--;
			}
			System.out.println(result);
		}
	}
}
