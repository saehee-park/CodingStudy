package week3;
/*
 * (n*��ǰ����) = �Һ����+(n*�������)
 * n = �Һ����/(��ǰ����-�������)
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sonik1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		if(c <= b) {
			System.out.println("-1");
		} else {
			System.out.println((a/(c-b))+1); // ������ ���� ������ n�� 1�� ������ ���̴�
		}
	}
}
