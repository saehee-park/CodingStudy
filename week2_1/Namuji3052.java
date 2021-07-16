package week2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Namuji3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int [] num = new int[42];
		int count = 0;
		
		for(int i=0; i<10; i++) {
			int number = Integer.parseInt(bf.readLine());
			num[number%42]++;
		}
		
		for(int i=0; i<42; i++) {
			if(num[i] != 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
