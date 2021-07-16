package week2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Average1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		float [] score = new float[n];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for(int i=0; i<n; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(score);
		float m = score[n-1];
		
		for(int i=0; i<n; i++) {
			score[i] = score[i]/m*100;
		}
		
		float newscore = 0;
		
		for(int i=0; i<n; i++) {
			newscore = newscore + score[i];
		}
		
		System.out.println(newscore/n);
	}

}
