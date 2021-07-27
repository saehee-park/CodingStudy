package week4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Triangle4153 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String s = null;
		
		while(sc.hasNext()) {
			int[] arr = new int[3];
			String result = "";
			
			for(int i=0; i<3; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			
			int a = arr[0];
			int b = arr[1];
			int c = arr[2];
			
			if(a==0 && b==0 && c==0) {
				break;
			}
			
			if(Math.pow(c, 2) == Math.pow(a, 2)+Math.pow(b, 2)) {
				result = "right";
			} else {
				result = "wrong";
			}
			
			System.out.println(result);
		}
	}
}
