package week4;

import java.util.Scanner;

public class AB10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			System.out.println(n1+n2);
		}
		sc.close();
	}
}
