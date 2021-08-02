package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Guitar1049 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()); // ����������
		int m = Integer.parseInt(st.nextToken()); // ��Ÿ�ٺ귣��

		int set [] = new int [m];
		int one [] = new int [m];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			set[i] = Integer.parseInt(st.nextToken()); // set
			one[i] = Integer.parseInt(st.nextToken()); // one
		}
		Arrays.sort(set);
		Arrays.sort(one);
		int price = Integer.MAX_VALUE;
		
		//���� �� 6��¥�� �� ���� vs ���� �� ���� ���� vs (����� 6��¥�� �� + ����)
		price = Math.min(((n/6)+1)*set[0], n*one[0]);    
		price = Math.min(price, ((n/6))*set[0] + (n%6)*one[0]);
		
		System.out.println(price);
	}

}
