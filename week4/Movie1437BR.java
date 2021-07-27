package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Movie1437BR {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int six = 666;
		int count =0;
		
		while(count != n) { // 입력되는 n번째 수가 아니면 계속해서 수행
			int num = six;
			int count666 = 0;
			
			while(num>0) {
				if(num%10 == 6) { // 10으로 나눈 나머지가 6인경우 카운트666
					count666++;
				} else { // 6이 연속으으로 나오지 않는다면 count 다시 0으로
					count666 = 0;
				}
				num /= 10;
				if(count666 >= 3) { // 6이 3번 카운팅됐으면 그 수 출력
					count++;
					break;
				}
			}
			six++;
		}
		System.out.println(six-1);
	}
}
