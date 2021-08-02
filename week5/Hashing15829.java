package week5;
/*
 * ��ⷯ ������ �Ӽ� (a * b) mod n = {(a mod n) * (b mod n)} mod n*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hashing15829 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String s = bf.readLine();
		
		long tmp = 1;
		long sum = 0;
		int m = 1234567891;
		int r = 31;
		
		for(int i=0; i<n; i++) {
			sum = (sum+((s.charAt(i)-'a'+1)*tmp))%m; // 'a'=97�ε� ���� 1�� �Ǿ���ϴ� +1
			tmp = (tmp*r)%m;
		}
		
		System.out.println(sum%m);
		bf.close();
	}
}
