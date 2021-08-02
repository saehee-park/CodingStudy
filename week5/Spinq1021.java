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
		int N = Integer.parseInt(st.nextToken());	// ť�� ũ��(1 ~ N)
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) { // 1���� n���� ���� ����
			deque.offer(i);
		}
		
		int[] seq = new int[M];	// �̰��� �ϴ� ��
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < M; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i = 0; i < M; i++) {
			int target = deque.indexOf(seq[i]); // ������ �̰��� �ϴ� ������ �ε��� ã�� 
			int half;

			if(deque.size() % 2 == 0) { // ���� ���� ���Ұ� ¦�����
				half = deque.size() / 2 - 1; // �߰� ������ ���� ����ũ�⿡�� -1�� ����
			}
			else {
				half = deque.size() / 2;
			}
			// {1, 2, 3, 4} �� ��, 2�� �߰��������� �ϸ� �ε����� 1�̶�
			
			
			// �߰� ���� �Ǵ� �߰� �������� ������ ��ġ�� �տ� ���� ���
			if(target <= half) {
				// idx ���� �տ� �ִ� ���ҵ��� ��� �ڷ� ���� (2�� ����)
				for(int j = 0; j < target; j++) {
					int temp = deque.pollFirst();
					deque.offerLast(temp);
					count++;
				}
			}
			else {	// �߰� �������� ������ ��ġ�� �ڿ� �ִ� ��� 
				// idx�� ������ �ڿ� �ִ� ���ҵ��� ��� ������ ���� (3�� ����)
				for(int j = 0; j < deque.size() - target; j++) {
					int temp = deque.pollLast();
					deque.offerFirst(temp);
					count++;
				}
			
			}
			deque.pollFirst();	// ������ ������ �� �� ���Ҹ� ����
		}
		
		System.out.println(count);
	}
}