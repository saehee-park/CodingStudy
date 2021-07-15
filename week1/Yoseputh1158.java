package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Yoseputh1158 {

	public static void main(String[] args) throws IOException {
		Queue<Integer> q = new LinkedList<Integer>();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=n; i++) {
			q.add(i);
		}
		
		System.out.print("<");
		
		while(q.size()!=1) {
			for(int i=0; i<k-1; i++) {
				q.add(q.poll());
			}
			System.out.print(q.poll()+", ");
		}
		
		System.out.print(q.poll()+">"); // 마지막 한명
	}
}
