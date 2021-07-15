package week1;

import java.util.Scanner;

public class Rot1655 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			String s = scanner.nextLine();
			int [] split = new int[s.length()];
			for (int i=0; i<split.length; i++) {
				split[i] = s.charAt(i); // 문자열 나눔
			}
			
			for(int i=0; i<split.length; i++) {
				if (split[i]>=97 && split[i]<=122) { // 소문자 97-122
					if(split[i]+13 > 'z') {
						split[i] -= 13;
					} else {
						split[i] += 13;
					}
				} else if (split[i]>=65 && split[i]<=90) { // 대문자 65-90
					if(split[i]+13 > 'Z') {
						split[i] -= 13;
					} else {
						split[i] += 13;
					}
				} 
			}
			
			for(int i=0; i<split.length; i++) {
				System.out.print((char)split[i]);
			}
			System.out.println();
		}
	}
}
