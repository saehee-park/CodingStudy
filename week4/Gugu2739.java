package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gugu2739 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		for(int i=1; i<10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}
