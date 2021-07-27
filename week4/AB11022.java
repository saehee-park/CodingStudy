package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AB11022 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b));
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
