package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Deq10866 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // ¸í·É ¼ö
		StringBuilder sb = new StringBuilder();
		Deque<String> q = new ArrayDeque<>();
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String s = st.nextToken();

			if (s.equals("push_front")) {
				q.offerFirst(st.nextToken());
			} else if (s.equals("push_back")) {
				q.offerLast(st.nextToken());
			} else if (s.equals("size")) {
				sb.append(q.size()).append('\n');
			} else if (s.equals("empty")) {
				if (q.isEmpty()) {
					sb.append(1).append('\n');
				} else {
					sb.append(0).append('\n');
				}
			} else if (s.equals("pop_front") || s.equals("pop_back") || s.equals("front") || s.equals("back")) {
				if(q.isEmpty()) {
					sb.append(-1).append('\n');
				} else if (s.equals("pop_front")) {
					sb.append(q.pollFirst()).append('\n');
				} else if (s.equals("pop_back")) {
					sb.append(q.pollLast()).append('\n');
				} else if (s.equals("front")) {
					sb.append(q.peekFirst()).append('\n');
				} else { // back
					sb.append(q.peekLast()).append('\n');
				}
			}
		}
		System.out.println(sb);
	}

}
