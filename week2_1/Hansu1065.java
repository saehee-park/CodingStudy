package week2_1;
/*
 * 일의자리와 십의자리는 무조건 등차수열이 나옴 (1-99) */
import java.util.Scanner;

public class Hansu1065 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int han = 0;
		int[] dc = new int[3]; // 등차수열
		
		if(n<100) {
			han = n;
		} else if(n == 1000) {
			han = 144; // 1000은 999와 넣었을때 같은 값으로 처리
		} else { // 세자리수에 대해서만 구현
			han = 99;
			for(int i=100; i<=n; i++) {
				int j = 0;
				int l = i;
				while(l>0) {
					dc[j] = l%10;
					l = l/10;
					j++;
				}
				if(dc[0] - dc[1] == dc[1] - dc[2]) { // 등차수열이면
					han++;
				}
			}
			
		}
		System.out.println(han);
		scanner.close();
	}

}
