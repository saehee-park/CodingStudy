package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * �Է¹��� 10^10000�� long(2^64-1)���Ұ�*/
public class AB10757 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		String sA = st.nextToken();
		String sB = st.nextToken();
		
		// �ΰ��� �� �� ���� �� �ڸ��� ���̸� ������
		int maxLength = Math.max(sA.length(), sB.length());

		int[] A = new int[maxLength+1]; // ������ �ڸ��� �ø��� ���� �� �����Ƿ� +1
		int[] B = new int[maxLength+1];
		
		// A �ʱ�ȭ
		for(int i=sA.length()-1, idx=0; i>=0; i--,idx++) {
			A[idx] = sA.charAt(i)-'0'; // �� �� ���ں��� �������� �ϳ��� ����
		}
		
		// B �ʱ�ȭ
		for(int i=sB.length()-1, idx=0; i>=0; i--,idx++) {
			B[idx] = sB.charAt(i)-'0'; // �� �� ���ں��� �������� �ϳ��� ����
		}
		
		for(int i=0; i<maxLength; i++) {
			int value = A[i]+B[i];
			A[i] = value%10; // ���� ���� 10���� ���� �������� �ڸ����� ��
			A[i+1] += (value/10); // ���� ���� 10���� ���� ���� �ø����� ��
		}
		
		// A�迭 ���� ���
		// ���� ū �ڸ����� 0�ϼ��� �ֱ� ������ 0�� �ƴҰ�쿡�� ���
		StringBuilder sb = new StringBuilder();
		if(A[maxLength] != 0) {
			sb.append(A[maxLength]);
		}
		
		for(int i=maxLength-1; i>=0; i--) {
			sb.append(A[i]);
		}
		System.out.println(sb);
	}

}
