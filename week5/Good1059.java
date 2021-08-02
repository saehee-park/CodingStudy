package week5;
/*https://blog.naver.com/soonil0119/222146741415*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Good1059 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int s[] = new int[l];
		StringTokenizer st = null;

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < l; i++) {
			s[i] = Integer.parseInt(st.nextToken());
		}
		
		int n = Integer.parseInt(br.readLine());
		Arrays.sort(s);
		
		int min = s[0], max = s[l-1];
		int count = 0;
		
		for (int i = 0; i < l; i++) {  // ���ԵǾ���ϴ� ���ڿ� ������ �ּڰ� �ִ� ã�� ����
			if(s[i] <= n && s[i]>min) {
				min = s[i];
			}
			if(s[i] >= n && s[i]<max) {
				max = s[i];
			}
		}
		
		if(n<min) { // N�� �������� ������ �ּڰ� ���� �տ� �ִ� ���
			if(n==1 || n==min-1) {
				count = min-2;
			} else {
				count = min-2;
				count += ((n-1)*(min-(n+1)));
			}
		} else if (n<max) { // N�� �������� �����͵� ���̿� �ִ� ���
			if(n==min+1 || n==max-1) {
				count = max-min-2;
			} else {
				count = max-min-2;
				count += ((n-(min+1))*(max-(n+1)));
			}
		}
		System.out.println(count);
		br.close();
	}

}
