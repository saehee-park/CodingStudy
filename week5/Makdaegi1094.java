package week5;
/*
 * 문제 이해가 어려웠었음.
 * 막대기를 반으로 나눠 더하는데, 구하려는것보다 크기가 크면 버리고 작으면 킵해둠
 * 이 과정을 반복*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Makdaegi1094 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int n = 64;
		int count = 0;
		
		while(x>0) {
			if(n>x) {
				n /= 2;
			} else {
				count++;
				x -= n;
			}
		}
		System.out.println(count);
	}
}
