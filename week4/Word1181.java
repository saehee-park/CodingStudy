package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Word1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String [] arr = new String [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = bf.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				// �ܾ� ���̰� ���� ��� 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				else {
					return s1.length() - s2.length(); // s1<s2�� ������ | ���ٸ� 0 | s1>s2�� �����
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]).append('\n');
		
		for(int i=1; i<n; i++) {
			if(!arr[i].equals(arr[i-1])) { // �ߺ����� �ʴ� �ܾ ���
				sb.append(arr[i]).append('\n');
			}
		}
		System.out.println(sb);
	}

}
