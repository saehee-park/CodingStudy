package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Card11652 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		int [] result = new int[n];
		int count = 0;
		int newcount = 0;
		for(int i=0; i<n; i++) {
			result[i] = Integer.parseInt(bf.readLine());
		}
		int num = result[0];
		Arrays.sort(result);
		
		for(int i=0; i<n-1; i++) { // 정렬한 값을 기준으로 앞뒤 같은지 확인
			if(result[i] == result[i+1]) {
				newcount ++;
			} else {
				newcount = 0; // 아니면 그냥 넘어감
			}
			
			if(count < newcount) { // 기존의 count값보다 크다면
				count = newcount; // count값을 최대값으로 다시 갱신
				num = result[i]; // 그 값을 저장
			}
		}
		System.out.println(num);
	}

}
