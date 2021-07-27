package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Four3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int x[] = new int[3];
		int y[] = new int[3];
		
		for(int i=0; i<3; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		if(x[0]==x[1]) {
			if(y[0] == y[2]) {
				System.out.println(x[2]+" "+y[1]);
			}
			if(y[1] == y[2]) {
				System.out.println(x[2]+" "+y[0]);
			}
		}
		if(x[0]==x[2]) {
			if(y[0] == y[1]) {
				System.out.println(x[1]+" "+y[2]);
			}
			if(y[2] == y[1]) {
				System.out.println(x[1]+" "+y[0]);
			}
		}
		if(x[1]==x[2]) {
			if(y[1] == y[0]) {
				System.out.println(x[0]+" "+y[2]);
			}
			if(y[2] == y[0]) {
				System.out.println(x[0]+" "+y[1]);
			}
		}
	}

}
