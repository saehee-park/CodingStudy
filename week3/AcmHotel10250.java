package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AcmHotel10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			if(n-h <= 0) {
				System.out.println(n*100+1);
			} else {
				System.out.println((n%h == 0) ? h*100+n/h : n%h*100+n/h+1);
			}
		}
		bf.close();
	}
}
