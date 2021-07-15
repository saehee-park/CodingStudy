package week1;

import java.util.Scanner;

public class String10820 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext()) {
			String s = scanner.nextLine();
			int [] split = new int[s.length()];
			for (int i=0; i<split.length; i++) {
				split[i] = s.charAt(i); // ���ڿ� ����
			}
			
			int [] result = {0, 0, 0, 0};
			
			for(int i=0; i<split.length; i++) {
				if (split[i]>=97 && split[i]<=122) { // �ҹ��� 97-122
					result[0] += 1;
				} else if (split[i]>=65 && split[i]<=90) { // �빮�� 65-90
					result[1] += 1;
				} else if (split[i] == 32) { // ����
					result[3] += 1;
				} else { // ����
					result[2] += 1;
				}
			}
			
			for(int i=0; i<result.length; i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
