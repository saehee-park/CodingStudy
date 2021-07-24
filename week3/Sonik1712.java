package week3;
/*
 * (n*상품가격) = 불변비용+(n*가변비용)
 * n = 불변비용/(상품가격-가변비용)
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sonik1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		if(c <= b) {
			System.out.println("-1");
		} else {
			System.out.println((a/(c-b))+1); // 이익이 나는 지점은 n에 1이 더해진 값이다
		}
	}
}
