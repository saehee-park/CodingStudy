package week5;
/*
 * ���� ���ذ� ���������.
 * ����⸦ ������ ���� ���ϴµ�, ���Ϸ��°ͺ��� ũ�Ⱑ ũ�� ������ ������ ŵ�ص�
 * �� ������ �ݺ�*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Makdaegi1094 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int n = 64;
		int count = 0;
		
		while(x>0) {
			if(n>x) {
				n /= 2;
			} else {
				count++;
				x -= n;
			}
		}
		System.out.println(count);
	}
}
