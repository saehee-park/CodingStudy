package week4;
/*
 * Arrays.sort�� ������� �ʴ� ��� > https://st-lab.tistory.com/108 ���2 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Tong2108 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int [] arr = new int [n];
		int sanavg = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			sanavg += arr[i];
		}
	
		
		Arrays.sort(arr);
		
		boolean flag = false; // ������ ������ �ֺ��� �ѹ��� ����������� true, �ƴϸ� false
		int modeMax = 0;
		int mode = 10000; // �ֺ�, -4000~4000�� ������ ���� �ʱ�ȭ
		
		for(int i=0; i<n; i++) {
			int jump = 0; // ������ ���� ���¸�ŭ i�� jump
			int count = 1;
			int iValue = arr[i];
			
			for(int j=i+1; j<n; j++) {
				if(iValue != arr[j]) {
					break;
				}
				count++;
				jump++;
			}
			
			if(count > modeMax) { // ���� �ֺ󰪺��� ���� ���� �󵵼��� �� ���� ���
				modeMax = count;
				mode = iValue;
				flag = true;
			} else if (count==modeMax && flag==true) {
				mode = iValue;
				flag = false;
			}
			i += jump;
		}
		
		System.out.println((int)Math.round((double)sanavg/n));
		System.out.println(arr[((n+1)/2)-1]); // index�� 0���� �����̶�
		System.out.println(mode);
		System.out.println(arr[n-1] - arr[0]);
		
		
	}

}
