package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumSort2750 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int [] num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = Integer.parseInt(bf.readLine());
		}
	
		Arrays.sort(num);
		for(int i : num) {
			System.out.println(i);
		}
		
	}

}
