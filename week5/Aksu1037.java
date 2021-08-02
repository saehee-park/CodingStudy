package week5;
/*
 * 어떤수 n을 n의 약수로 나누면 그 수도 n의 약수가 된다
 * 어떤 수 n의 약수 중 가장 작은 수로 n을 나누면 그 결과는 n의 약수 중 가장 큰 수가 된다
 * ex) 8의 약수 1,2,4,8
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Aksu1037 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int arr [] = new int [t];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<t; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		if(t == 1) { // 제곱수같은 경우 .. 1 5 25
			System.out.println(arr[0]*arr[0]);
		} else {
			System.out.println(arr[0]*arr[arr.length-1]);
		}
	}

}
