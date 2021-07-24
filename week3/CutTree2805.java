package week3;
/*
 * �̺�Ž�� �ٽ� ���� !! */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CutTree2805 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()); // �����Ǽ�
		int m = Integer.parseInt(st.nextToken()); // ������ ���������� ����
		
		int [] arr = new int [n];
		st = new StringTokenizer(bf.readLine(), " ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		long max = arr[n-1];
		long min = 1; // ���̴� �ڿ���
		long middle = 0;
		
		while(max>=min) { // �̺�Ž�� ����
			middle = (max+min)/2;
			long count = 0;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i]-middle<=0) continue;
				count += arr[i]-middle;
			}
			
			if(count>=m) {
				min = middle+1;
			} else {
				max = middle-1;
			}
		}
		System.out.println(max);
	}
}
