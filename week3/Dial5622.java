package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String s = bf.readLine();
		int [] arr = new int [10];
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C') {
				arr[2]++;
			} else if(s.charAt(i) == 'D' || s.charAt(i) == 'E' || s.charAt(i) == 'F') {
				arr[3]++;
			} else if(s.charAt(i) == 'G' || s.charAt(i) == 'H' || s.charAt(i) == 'I') {
				arr[4]++;
			} else if(s.charAt(i) == 'J' || s.charAt(i) == 'K' || s.charAt(i) == 'L') {
				arr[5]++;
			} else if(s.charAt(i) == 'M' || s.charAt(i) == 'N' || s.charAt(i) == 'O') {
				arr[6]++;
			} else if(s.charAt(i) == 'P' || s.charAt(i) == 'Q' || s.charAt(i) == 'R' && s.charAt(i) == 'S') {
				arr[7]++;
			} else if(s.charAt(i) == 'T' || s.charAt(i) == 'U' || s.charAt(i) == 'V') {
				arr[8]++;
			} else {
				arr[9]++;
			}
		}
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]*(i+1);
		}
		
		System.out.println(sum);
	}

}
