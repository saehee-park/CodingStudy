package week3;

import java.util.Scanner;

public class AB2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		
		System.out.println(a*(b.charAt(2)-'0')); // (3)
		System.out.println(a*(b.charAt(1)-'0'));
		System.out.println(a*(b.charAt(0)-'0'));
		System.out.println(a*Integer.parseInt(b));
		sc.close();
	}

}
