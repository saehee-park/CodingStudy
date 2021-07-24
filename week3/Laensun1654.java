package week3;
/*
 * middle을 구하는 과정중에 min, max모두 int 범위를 넘을 수 있음
 * middle도 max+min 하게되면 int 범위 넘음 middle은 int를 벗어남*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Laensun1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int k = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선
		int n = Integer.parseInt(st.nextToken()); // 필요한 랜선 개수

		int [] arr = new int [k];
		for(int i=0; i<k; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(arr);
		
		long max = arr[k-1];
		long min = 1; // 랜선 길이는 자연수
		long middle = 0;
		
		while(max>=min) { // 이분탐색 시작
			middle = (max+min)/2;
			long count = 0;
			
			for(int i=0; i<arr.length; i++) { // 자른 개수 합
				count += arr[i]/middle;
			}
			
			if(count>=n) { // 더 많은 랜선 나온 경우 더 크게 잘라줘야함
				min = middle+1;
			} else {
				max = middle-1;
			}
				
		}
		System.out.println(max);
	}

}
