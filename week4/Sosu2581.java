package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sosu2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(bf.readLine());
		int n = Integer.parseInt(bf.readLine());
		
		int i,j;
		int min = -1;
		int sum = 0;
		
		for(i=m; i<=n; i++) {
			for(j=2; j<i; j++) {
				if(i%j == 0) {
					break;
				}
			}
			if(i == j) {
				if(min == -1) {
					min = i;
				}
				sum += i;
			}
		}
		
		if(sum != 0) {
			System.out.println(sum);
		}
		System.out.println(min);
	}
}
