package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugar2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int count = 0;
		
		if(n<3) {
			System.out.println(-1);
		} else {
			while(true) {
				if(n%5 == 0) {
					System.out.println(n/5+count);
					break;
				} else if(n <= 0) {
					System.out.println(-1);
					break;
				}
				
				n = n-3;
				count++;
			}
		}
		bf.close();
	}
}
