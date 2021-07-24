package week3;
/*
 * 이해 필요 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hive2292 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		// n-2하면 0-5, 6-17, 18-35 이런식
		int result = (n - 2) / 6; // 몇번째 둘레인지 찾음

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
