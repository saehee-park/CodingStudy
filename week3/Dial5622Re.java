package week3;
/*
 *  else-if문에선 가장 경우의수가 적은것을 먼저 비교해주는게 빠르다
 *  */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial5622Re {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String s = bf.readLine();
		int sum=0;
		char [] arr = new char [26];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (char)(65+i); // 'A' ~
			
			for(int j=0; j<s.length(); j++) {
				char c = s.charAt(j);
				if(arr[i] == c) {
					if(i == 25) { // Z도 4개이다
						sum += 10;
					} else if(i >= 18) { // R부터 3개씩 묶이던 규칙이 깨진다
						sum += ((i-1)/3+3); // 18번이 17번이 되어 값이 -1씩 되게
					} else {
						sum += (i/3+3); // ABC는 0+3, DEF는 1+3 ...
					}
				}
			}
		}
		System.out.println(sum);
	}
}
