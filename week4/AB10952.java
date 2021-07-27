package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AB10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		while(true) {
			st = new StringTokenizer(bf.readLine(), " ");
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			if(n1 == 0 && n2 == 0) {
				break;
			}
			sb.append(n1+n2);
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
