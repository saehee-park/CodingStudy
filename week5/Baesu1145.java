package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baesu1145 {

public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int [] arr = new int [5];
		int min = 100; // 100보다 작은 자연수
		
		st = new StringTokenizer(bf.readLine(), " ");
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		int count = 0;
		while(true) {
			for(int i=0; i<5; i++) {
				if(min%arr[i] == 0) {
					count++;
				}
			}
			if(count>=3) {
				break; // 적어도 세개로 나눠지면 탈출
			}
			
			count = 0; // 초기화
			min++; // 최소값부터 하나씩 올리기
		}
		System.out.println(min);
	}

}
