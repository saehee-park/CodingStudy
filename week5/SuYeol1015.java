package week5;

import java.util.Scanner;

public class SuYeol1015 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[50];
		int[] result = new int[50]; // 0 초기화

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[i])
					result[j]++;
				else
					result[i]++; // 해댱 i 번째 수행시 값 ++
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(result[i]+" ");
		}
		sc.close();
	}
}
