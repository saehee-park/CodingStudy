package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AgeSort10814 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		StringBuilder[] index = new StringBuilder[201]; // ���̹��� 1~200
		for(int i=0; i<index.length; i++) {
			index[i] = new StringBuilder(); // �� �ε����� sb ��ü ����
		}
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			index[age].append(age).append(' ').append(name).append('\n'); // �ش� �迭�� ���̿� �̸� �ֱ�
		}
		
		StringBuilder sb = new StringBuilder();
		for(StringBuilder value : index) {
			sb.append(value);
		}
		System.out.println(sb);
	}

}
