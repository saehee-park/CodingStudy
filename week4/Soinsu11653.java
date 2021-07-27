package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soinsu11653 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int tmp=2;
		
		while(n != 0 && n != 1) {
			if(n%tmp == 0) {
				n = n/tmp;
				System.out.println(tmp);
			} else {
				tmp++;
			}
		}
	}
}
