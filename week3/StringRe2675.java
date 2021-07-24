package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringRe2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<n; i++) {
			String [] arr = bf.readLine().split(" ");
			
			int re = Integer.parseInt(arr[0]);
			String s = arr[1];
			
			for(int j=0; j<s.length(); j++) {
				for(int l=0; l<re; l++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
