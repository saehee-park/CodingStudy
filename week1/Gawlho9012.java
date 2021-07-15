package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Gawlho9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // 입력 수
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(found(bf.readLine())).append('\n');
		}
		System.out.println(sb);
	}

	private static Object found(String s) {
		Stack<Character> stack = new Stack<>();
		
		char tmp;
		for(int i=0; i<s.length(); i++) {
			tmp = s.charAt(i);
			
			if(tmp == '(') {
				stack.push(tmp);
			} else if (stack.isEmpty()) {
				return "NO";
			} else { // )인경우
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}
	}

}
