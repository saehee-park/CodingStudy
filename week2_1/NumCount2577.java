package week2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumCount2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int c = Integer.parseInt(bf.readLine());
		int cal = a*b*c;
		String s = Integer.toString(cal);
		
		for(int i=0; i<10; i++) {
			int count=0;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j)-'0' == i) { // '1'은 아스키코드 49번
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
