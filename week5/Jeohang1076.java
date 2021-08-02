package week5;

import java.io.*;

public class Jeohang1076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] colors = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
		int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] multiplies = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000 };
		long result = 0;

		for (int i = 0; i < 3; i++) {
			int index = java.util.Arrays.asList(colors).indexOf(br.readLine()); // 자바는 배열에서 indexOf를 제공하지 않으니 List에서 적용해야함
			if (i != 2) {
				result = result * 10 * i + values[index];
			} else {
				if (index != 0)
					result = result * multiplies[index];
			}
		}

		wr.write(String.valueOf(result));
		wr.flush();
	}
}
