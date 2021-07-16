package week2;
/*
 * 2750 수정렬하기1과 비슷하지만
 * 출력을 print가 아닌 Stringbuilder 사용 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumSort10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int [] num = new int[n];
		StringBuilder sb = new StringBuilder(); // StringBuilder 사용 후 시간초과 해결
		
		for(int i=0; i<n; i++) {
			num[i] = Integer.parseInt(bf.readLine());
		}
	
		Arrays.sort(num);
		for(int i : num) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
}
