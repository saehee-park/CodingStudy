package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci10870 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		Fibonacci10870 f = new Fibonacci10870();
		int result = f.fibo(n);
		System.out.println(result);
		
	}

	private int fibo(int n) {
		if(n<=0) return 0;
		else if(n==1) return 1;
		else return fibo(n-1) + fibo(n-2);
	}

}
