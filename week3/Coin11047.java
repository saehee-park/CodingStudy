package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Coin11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Integer [] coin = new Integer [n]; // 내림차순 정렬 하려면 Integer 사용해야함
		
		for(int i=0; i<n; i++) {
			coin[i] = Integer.parseInt(bf.readLine());
		}
		
		int count=0;
		Arrays.sort(coin, Collections.reverseOrder()); // 내림차순 정렬
		
		for(int i=0; i<n; i++) {
			if(coin[i] > k) { // 동전이 남은 돈보다 크면 안됨
				continue;
			} else {
				count += k/coin[i];
				k %= coin[i];
			}
		}
		System.out.println(count);
	}

}
