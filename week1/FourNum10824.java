package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FourNum10824 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		// int 범위를 벗어나서 long을 사용해야함
		long ab = Long.parseLong(st.nextToken()+st.nextToken());
		long cd = Long.parseLong(st.nextToken()+st.nextToken());
		
		System.out.println(ab+cd);
	}
}
