package week3;
/*
 * middle�� ���ϴ� �����߿� min, max��� int ������ ���� �� ����
 * middle�� max+min �ϰԵǸ� int ���� ���� middle�� int�� ���*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Laensun1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int k = Integer.parseInt(st.nextToken()); // ������ �ִ� ����
		int n = Integer.parseInt(st.nextToken()); // �ʿ��� ���� ����

		int [] arr = new int [k];
		for(int i=0; i<k; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(arr);
		
		long max = arr[k-1];
		long min = 1; // ���� ���̴� �ڿ���
		long middle = 0;
		
		while(max>=min) { // �̺�Ž�� ����
			middle = (max+min)/2;
			long count = 0;
			
			for(int i=0; i<arr.length; i++) { // �ڸ� ���� ��
				count += arr[i]/middle;
			}
			
			if(count>=n) { // �� ���� ���� ���� ��� �� ũ�� �߶������
				min = middle+1;
			} else {
				max = middle-1;
			}
				
		}
		System.out.println(max);
	}

}
