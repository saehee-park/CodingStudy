package week4;
/*
 * Arrays.sort를 사용하지 않는 방법 > https://st-lab.tistory.com/108 방법2 */
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
		
		boolean flag = false; // 이전의 동일한 최빈값이 한번만 등장했을경우 true, 아니면 false
		int modeMax = 0;
		int mode = 10000; // 최빈값, -4000~4000을 제외한 수로 초기화
		
		for(int i=0; i<n; i++) {
			int jump = 0; // 동일한 수가 나온만큼 i값 jump
			int count = 1;
			int iValue = arr[i];
			
			for(int j=i+1; j<n; j++) {
				if(iValue != arr[j]) {
					break;
				}
				count++;
				jump++;
			}
			
			if(count > modeMax) { // 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우
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
		System.out.println(arr[((n+1)/2)-1]); // index는 0부터 시작이라
		System.out.println(mode);
		System.out.println(arr[n-1] - arr[0]);
		
		
	}

}
