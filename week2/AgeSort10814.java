package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AgeSort10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		StringBuilder[] index = new StringBuilder[201]; // 나이범위 1~200
		for(int i=0; i<index.length; i++) {
			index[i] = new StringBuilder(); // 각 인덱스에 sb 객체 생성
		}
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			index[age].append(age).append(' ').append(name).append('\n'); // 해당 배열에 나이와 이름 넣기
		}
		
		StringBuilder sb = new StringBuilder();
		for(StringBuilder value : index) {
			sb.append(value);
		}
		System.out.println(sb);
	}

}
