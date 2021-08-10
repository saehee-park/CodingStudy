package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Odd1225 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String n = st.nextToken();
		String m = st.nextToken();
		long sum = 0;
		
		for(int i=0; i<n.length(); i++) {
			for(int j=0; j<m.length(); j++) {
				sum += Integer.parseInt(n.charAt(i)+"")*Integer.parseInt(m.charAt(j)+""); 
			}
		}
		
		System.out.println(sum);
	}

}
