package week5;
/*
 * ��� n�� n�� ����� ������ �� ���� n�� ����� �ȴ�
 * � �� n�� ��� �� ���� ���� ���� n�� ������ �� ����� n�� ��� �� ���� ū ���� �ȴ�
 * ex) 8�� ��� 1,2,4,8
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Aksu1037 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int arr [] = new int [t];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<t; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		if(t == 1) { // ���������� ��� .. 1 5 25
			System.out.println(arr[0]*arr[0]);
		} else {
			System.out.println(arr[0]*arr[arr.length-1]);
		}
	}

}
