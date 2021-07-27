package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Movie1436 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String s = "666";
		
		String ns = String.valueOf(n-1);
		System.out.println(Integer.parseInt(ns+s));
	}
}
