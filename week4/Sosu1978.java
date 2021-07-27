package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sosu1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int count=0;
		String[] input = bf.readLine().split(" ");
		
		while(n-- != 0) {
			boolean b = true;
			int x = Integer.parseInt(input[n]);
			
			for(int i=2; i<x; i++) {
				if(x%i == 0) {
					b = false;
					break;
				}
			}
			
			if(b && x > 1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
