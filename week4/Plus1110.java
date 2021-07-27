package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plus1110 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int tmp = n; // 26
		int count = 0;

		while(true) {
			String s = "";
			s += tmp%10; // s=6
			s += ((tmp/10)+(tmp%10))%10; // s=6+8 > 货肺款 荐
			tmp = Integer.parseInt(s); // 货肺款 荐 历厘
			count++;
			
			if(tmp == n) {
				System.out.println(count);
				break;
			}
		}
	}
}
