package week3;

import java.util.Scanner;

public class Croatia2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int len = s.length();
		int count = 0;
		
		for(int i=0; i<len; i++) {
			char c = s.charAt(i);
			
			if(c == 'c') {
				if(i<len-1) { // ������ ���ڿ������� �����Ϸ���
					if(s.charAt(i+1) == '=') {
						i++; // �ϳ��� �����̹Ƿ� ���� ���� �ǳʶٱ� ����
					} else if(s.charAt(i+1) == '-') {
						i++;
					}
				}
			}
			
			else if(c == 'd') {
				if(i<len-1) {
					if(s.charAt(i+1) == 'z') {
						if(s.charAt(i+2) == '=') {
							i+=2;
						}
					} else if(s.charAt(i+1) == '-') {
						i++;
					}
				}
			}
			
			else if(c == 'l') {
				if(i<len-1) {
					if(s.charAt(i+1) == 'j') {
						i++;
					}
				}
			}
			
			else if(c == 'n') {
				if(i<len-1) {
					if(s.charAt(i+1) == 'j') {
						i++;
					}
				}
			}
			
			else if(c == 's') {
				if(i<len-1) {
					if(s.charAt(i+1) == '=') {
						i++;
					}
				}
			}
			
			else if(c == 'z') {
				if(i<len-1) {
					if(s.charAt(i+1) == '=') {
						i++;
					}
				}
			}
			
			count++;
		}
		
		System.out.println(count);
		sc.close();
	}
}
