package week5;
/*
 * A는 재배열이 가능하므로 오름차순 정렬한 뒤 A의 작은값부터 꺼내와서 B의 가장 큰 값과 곱한다
 * 다음 곱셈에서 중복된 B의 값을 꺼내면 안되니 B의 가장 큰수를 -1로 변경해준다. */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Treasure1026 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[] = new int [n];
		int b[] = new int [n];
		
		StringTokenizer stA = new StringTokenizer(br.readLine(), " ");
		StringTokenizer stB = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(stA.nextToken());
			b[i] = Integer.parseInt(stB.nextToken());
		}

		Arrays.sort(a);
		
		int sum = 0;
		int maxIdx = 0;
		
		for(int i=0; i<n; i++) {
			int max = -1;
			for(int j=0; j<n; j++) {
				if(max < b[j]) {
					max = b[j];
					maxIdx = j;
				}
			}
			b[maxIdx] = -1;
			
			sum += a[i]*max;
		}
		System.out.println(sum);
	}
}
