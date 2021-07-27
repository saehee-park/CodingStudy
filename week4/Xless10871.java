package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Xless10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(bf.readLine(), " ");
		for(int i=0; i<n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if(tmp<x) {
				System.out.print(tmp+" ");
			}
		}
	}
}
