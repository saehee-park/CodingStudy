package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 입력범위 10^10000라 long(2^64-1)사용불가*/
public class AB10757 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		String sA = st.nextToken();
		String sB = st.nextToken();
		
		// 두개의 수 중 가장 긴 자리수 길이를 구해줌
		int maxLength = Math.max(sA.length(), sB.length());

		int[] A = new int[maxLength+1]; // 마지막 자리수 올림이 있을 수 있으므로 +1
		int[] B = new int[maxLength+1];
		
		// A 초기화
		for(int i=sA.length()-1, idx=0; i>=0; i--,idx++) {
			A[idx] = sA.charAt(i)-'0'; // 맨 뒤 문자부터 역순으로 하나씩 저장
		}
		
		// B 초기화
		for(int i=sB.length()-1, idx=0; i>=0; i--,idx++) {
			B[idx] = sB.charAt(i)-'0'; // 맨 뒤 문자부터 역순으로 하나씩 저장
		}
		
		for(int i=0; i<maxLength; i++) {
			int value = A[i]+B[i];
			A[i] = value%10; // 더한 값의 10으로 나눈 나머지가 자리값이 됨
			A[i+1] += (value/10); // 더한 값의 10으로 나눈 몫이 올림값이 됨
		}
		
		// A배열 역순 출력
		// 가장 큰 자리수가 0일수도 있기 때문에 0이 아닐경우에만 출력
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
