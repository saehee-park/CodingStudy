package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Card10816 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // 카드 개수
		int [] cards = new int [n];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for(int i=0; i<n; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(bf.readLine());
		int [] finds = new int[m];
		st = new StringTokenizer(bf.readLine(), " ");
		for(int i=0; i<m; i++) {
			finds[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<m; i++) {
			int count=0;
			for(int j=0; j<n; j++) {
				if(finds[i] == cards[j]) {
					count++;
				}
			}
			sb.append(count);
			sb.append(" ");
		}
		System.out.println(sb);
	}
}
