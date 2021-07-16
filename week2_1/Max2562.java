package week2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int max = 0;
		int [] num = new int[9];
		
		for(int i=0; i<9; i++) {
			num[i] = Integer.parseInt(bf.readLine());
		}
		
		for(int i=0; i<9; i++) {
			if(num[i] > max) {
				max = num[i];
				count = i;
			}
		}
		System.out.println(max);
		System.out.println(count+1);
	}

}
