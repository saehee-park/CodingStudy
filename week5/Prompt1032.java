package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prompt1032 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String [n];

		for(int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		
		boolean same = true;
		StringBuilder sb = new StringBuilder();
		
		// ���� �迭�� ���� �迭�� ���� ��
		for(int i=0; i<arr[0].length(); i++) {
			for(int j=0; j<n-1; j++) {
				if(arr[j].charAt(i) == arr[j+1].charAt(i)) {
					same = true;
				} else {
					same = false;
					break;
				}
			}
			if(!same) { // �ٸ��ٸ�
				sb.append("?"); // ? �߰�
			} else {
				sb.append(arr[0].charAt(i)); // �ƴϸ� �ش� ���ĺ� �߰�
			}
		}
		System.out.println(sb.toString());
	}

}
