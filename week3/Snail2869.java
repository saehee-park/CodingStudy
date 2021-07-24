package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		if((v-a)%(a-b) == 0) { // ������ �������� �������� ���� ����
			System.out.println((v-a)/(a-b) + 1);
		} else { // ������ �������� �ʴ´ٸ� (v-a)�� �ö󰡴µ� �ɸ� ���� (v-a)/(a-b)�� �������̶� 1 ������
			// �׸��� (v-a)�� �ö� ���� �� ���� �����ϱ� ������ 1�� �� ���� ���� +2
			System.out.println((v-a)/(a-b) + 2);
		}
	}
}
