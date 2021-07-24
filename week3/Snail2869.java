package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		if((v-a)%(a-b) == 0) { // 나누어 떨어지면 다음날에 정상 도착
			System.out.println((v-a)/(a-b) + 1);
		} else { // 나누어 떨어지지 않는다면 (v-a)를 올라가는데 걸린 날이 (v-a)/(a-b)의 다음날이라 1 더해줌
			// 그리고 (v-a)를 올라간 다음 날 정상에 도착하기 때문에 1을 또 더해 도합 +2
			System.out.println((v-a)/(a-b) + 2);
		}
	}
}
