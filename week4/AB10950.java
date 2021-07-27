package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AB10950 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
