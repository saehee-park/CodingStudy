package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bunhae2231 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int result = 0; // 결과값
		
		for(int i=1; i<n; i++) {
			int num = i;
			int sum = i; // 분해합
			
			while(num != 0) {
				sum += num%10;
				num = num/10;
			}
			if(sum == n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
