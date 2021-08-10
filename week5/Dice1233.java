package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Dice1233 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int s1 = Integer.parseInt(st.nextToken());
		int s2 = Integer.parseInt(st.nextToken());
		int s3 = Integer.parseInt(st.nextToken());
		
		int[] result = new int[s1*s2*s3];
        Arrays.fill(result, 100); // 초기화
        
        for (int i = 1; i <= s1; i++) { // 완전 탐색
            for (int j = 1; j <= s2; j++) {
                for(int k = 1; k <= s3; k++){
                    result[i + j + k]--;
                }
            }
        }
        
        int min = 100;
        int index = -1;
        for(int n = 0; n < result.length; n++){
            if(min > result[n]){
                min = result[n];
                index = n;
            }
        }

        System.out.println(index);
	}
}
