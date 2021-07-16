package week2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ox8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		
		String arr[] = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] =  bf.readLine();
		}
		
		
		for(int i=0; i<n; i++) {
			int count=0, sum=0;
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum = sum + count;
			}
			sb.append(sum).append('\n');
		}
		System.out.print(sb);
	}
}
