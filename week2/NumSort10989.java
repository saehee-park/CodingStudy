package week2;
/*
 * 2750 �������ϱ�1�� ���������
 * ����� print�� �ƴ� Stringbuilder ��� */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumSort10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int [] num = new int[n];
		StringBuilder sb = new StringBuilder(); // StringBuilder ��� �� �ð��ʰ� �ذ�
		
		for(int i=0; i<n; i++) {
			num[i] = Integer.parseInt(bf.readLine());
		}
	
		Arrays.sort(num);
		for(int i : num) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
}
