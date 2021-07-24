package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int [] p = new int [n];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for(int i=0; i<n; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(p);
		
		int min = 0;
		int sum = 0;
		for(int i=0; i<n; i++) {
			min += p[i];
			sum += min;
		}
		
		System.out.println(sum);
	}
}
