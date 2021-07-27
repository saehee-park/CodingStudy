package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AB1552 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
