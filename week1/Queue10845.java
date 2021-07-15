package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue10845 {

	public static void main(String[] args) throws IOException {

		Queue<Integer> q = new LinkedList<Integer>();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // ¸í·É ¼ö
		System.out.println();
		
		int lastNum = 0;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String s = st.nextToken();

			if (s.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				q.add(num);
				lastNum = num;
			} else if (s.equals("pop")) {
				if (q.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(q.poll());
				}
			} else if (s.equals("size")) {
				System.out.println(q.size());
			} else if (s.equals("empty")) {
				if (q.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (s.equals("front")) {
				if (q.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(q.peek());
				}
			} else if (s.equals("back")) {
				if (q.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(lastNum);
				}
			}
		}
	}

}
