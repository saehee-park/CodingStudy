package week5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
import java.util.LinkedList;
import java.util.StringTokenizer;
 
public class Spinq1021 {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		LinkedList<Integer> deque = new LinkedList<Integer>();
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());	// 큐의 크기(1 ~ N)
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) { // 1부터 n까지 덱에 담음
			deque.offer(i);
		}
		
		int[] seq = new int[M];	// 뽑고자 하는 수
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < M; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i = 0; i < M; i++) {
			int target = deque.indexOf(seq[i]); // 덱에서 뽑고자 하는 숫자의 인덱스 찾기 
			int half;

			if(deque.size() % 2 == 0) { // 현재 덱의 원소가 짝수라면
				half = deque.size() / 2 - 1; // 중간 지점을 현재 절반크기에서 -1만 감소
			}
			else {
				half = deque.size() / 2;
			}
			// {1, 2, 3, 4} 일 때, 2를 중간지점으로 하면 인덱스는 1이라서
			
			
			// 중간 지점 또는 중간 지점보다 원소의 위치가 앞에 있을 경우
			if(target <= half) {
				// idx 보다 앞에 있는 원소들을 모두 뒤로 보냄 (2번 연산)
				for(int j = 0; j < target; j++) {
					int temp = deque.pollFirst();
					deque.offerLast(temp);
					count++;
				}
			}
			else {	// 중간 지점보다 원소의 위치가 뒤에 있는 경우 
				// idx를 포함한 뒤에 있는 원소들을 모두 앞으로 보내 (3번 연산)
				for(int j = 0; j < deque.size() - target; j++) {
					int temp = deque.pollLast();
					deque.offerFirst(temp);
					count++;
				}
			
			}
			deque.pollFirst();	// 연산이 끝나면 맨 앞 원소를 삭제
		}
		
		System.out.println(count);
	}
}