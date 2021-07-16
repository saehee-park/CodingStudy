package week2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MaxMi10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		
		int [] num = new int[n];
		st = new StringTokenizer(bf.readLine(), " "); // 한줄 띄우려면 새로운 st 선언해야함
		for(int i=0; i<n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num);
		System.out.print(num[0]+" ");
		System.out.print(num[n-1]);
	}

}
