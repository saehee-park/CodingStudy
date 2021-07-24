package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bunsu1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int cross = 1; // 해당 범위의 대각선 개수
		int sum = 0; // 1부터 직전 대각선 까지의 원소 갯수
		
		while(true) {
			
			if(n <= sum+cross) {
				
				if(cross%2 == 1) { // 분모+분자합이 홀수면 분모가 큰 수부터
					// 분모 : 대각선 개수 - (n-직전 대각선까지의 원소누적개수합-1)
					// 분자 : n-직전  대각선까지의 원수누적개수합 > 대각선에서 분자번째 위치함
					// 대각선의 개수와 분자+분모의 합은 1의 차이가 남
					System.out.print((cross - (n-sum-1)) +"/"+ (n-sum));
					break;
				} else { // 짝수면 홀수와 반대로 출력
					System.out.print((n-sum) +"/"+ (cross - (n-sum-1)));
					break;
				}
				
			} else {
				sum += cross;
				cross++;
			}
		}
	}
}
