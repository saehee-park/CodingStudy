package week2;

import java.util.Arrays;
import java.util.Scanner;

public class SortInside1427 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String s = scanner.nextLine();
		char[] split = new char[s.length()];
		for (int i = 0; i < split.length; i++) {
			split[i] = s.charAt(i); // ¹®ÀÚ¿­ ³ª´®
		}

		Arrays.sort(split);
		for (int i = split.length-1; i > -1; i--) {
			System.out.print(split[i]);
		}
		scanner.close();
	}
}
