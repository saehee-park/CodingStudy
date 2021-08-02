package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bunsan1009 {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int result[] = new int [n];
		
		StringTokenizer st = null;
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			result[i] = 1;
			for(int j=0; j<b; j++) {
				result[i] = (result[i]*a)%10; // 뒷자리수가 반복되니 넣어줌
			}
		}
		
		for(int i=0; i<result.length; i++) {
			if(result[i] == 0) { // 10으로 나눈 나머지가 0일경우 10번째 컴퓨터 의미
				System.out.println("10");
			} else {
				System.out.println(result[i]);
			}
		}
	}
}
