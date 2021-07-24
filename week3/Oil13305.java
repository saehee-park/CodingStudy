package week3;
/*
 * int�� ������ ������ �ѱ⿡ ����� ū �����͵��� ������ long���� ó�� */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Oil13305 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		long [] road = new long [n-1];
		long [] price = new long [n];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for(int i=0; i<n-1; i++) {
			road[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(bf.readLine(), " ");
		for(int i=0; i<n; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		long minPrice = price[0]; // ���� ������ ���� �� ���� �ּ� ���
		long sum = 0;
		
		for(int i=0; i<n-1; i++) {
			if(price[i]<minPrice) { // ���� �����Ұ� ���� �������� �⸧���� �Ұ��
				minPrice = price[i]; // minPrice ����
			}
			
			sum += (road[i]*minPrice);
		}
		System.out.println(sum);
	}

}
