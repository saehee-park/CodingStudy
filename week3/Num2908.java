package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		StringBuffer na = new StringBuffer(a);
		StringBuffer nb = new StringBuffer(b);
		a = na.reverse().toString();
		b = nb.reverse().toString();
		
		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);
		
		if(A>B) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}
	}
}
