package week3;
/*
 * ���� �ʿ� */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hive2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		// n-2�ϸ� 0-5, 6-17, 18-35 �̷���
		int result = (n - 2) / 6; // ���° �ѷ����� ã��

		int sum = 0;
		int count = 1;

		while (sum <= result) {
			if (n <= 1) {
				break;
			} else {
				sum = sum + count;
				count++;
			}
		}
		
		System.out.println(count);
		bf.close();
	}

}
