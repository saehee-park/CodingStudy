package week3;
/*
 * int형 데이터 범위를 넘기에 충분히 큰 데이터들이 들어오니 long으로 처리 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Oil13305 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		long [] road = new long [n-1];
		long [] price = new long [n];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for(int i=0; i<n-1; i++) {
			road[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(bf.readLine(), " ");
		for(int i=0; i<n; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		long minPrice = price[0]; // 이전 까지의 과정 중 주유 최소 비용
		long sum = 0;
		
		for(int i=0; i<n-1; i++) {
			if(price[i]<minPrice) { // 현재 주유소가 이전 주유소의 기름보다 쌀경우
				minPrice = price[i]; // minPrice 갱신
			}
			
			sum += (road[i]*minPrice);
		}
		System.out.println(sum);
	}

}
