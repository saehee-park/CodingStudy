package week1;

import java.util.Scanner;

public class FindNum1920 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int [] ns = new int[n];
		for (int i=0; i<n; i++) {
			ns[i] = scanner.nextInt();
		}
		
		int m = scanner.nextInt();
		int [] ms = new int[m];
		for (int i=0; i<m; i++) {
			ms[i] = scanner.nextInt();
		}
		
		int [] result = new int[m];
		
		
		for(int i=0; i<m; i++) {
			boolean found = false;
			for(int j=0; j<n; j++) {
				if(ms[i] == ns[j] && found == false) {
					result[i] = 1;
					found = true;
				} else if (ms[i] != ns[j] && found == false) {
					result[i] = 0;
				}
			}
		}
		
		for (int i=0; i<m; i++) {
			System.out.println(result[i]);
		}

	}

}