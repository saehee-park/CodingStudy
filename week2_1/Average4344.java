package week2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(bf.readLine());
		StringTokenizer st;
		
		for(int i=0; i<c; i++) {
			st = new StringTokenizer(bf.readLine()," ");
			int n =  Integer.parseInt(st.nextToken());
			int[] score = new int[n];
			double sum=0;
			
			for(int j=0; j<n; j++) {
				int val = Integer.parseInt(st.nextToken());
				score[j] = val;
				sum += val;
			}
			
			
			double avg = (sum/n);
			double count=0;
			
			for(int j=0; j<n; j++) {
				if(score[j]>avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/n)*100);
		}
		bf.close();
	}

}
