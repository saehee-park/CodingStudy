package week2_1;

public class SelfNum4673 {

	
	public static void main(String[] args) {
		int[] arr = new int[10036]; // 9999
		int temp, result;
		
		for(int i=1; i<=10000; i++) { // 부르트 포스 방식으로 일일히 셀프넘버 찾기
			temp = i;
			result=i;
			
			while(temp>0) {
				result = result + temp%10;
				temp = temp/10;
			}
			arr[result]++;
		}
		
		for(int i=1; i<=10000; i++) { // 또다시 10000이 넘지않는 셀프넘버만 출력
			if(arr[i] == 0) {
				System.out.println(i);
			}
		}
	}

}
