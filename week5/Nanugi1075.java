package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nanugi1075 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int f = Integer.parseInt(br.readLine());

		int tmp = (n/100)*100; // 맨뒤 두자리 없애줌
		while(true) {
			if(tmp%f == 0) {
				int rst = tmp%100;
				if(rst < 10) { // 한자리수
					System.out.println("0" + rst);
				} else {
					System.out.println(rst);
				}
				return;
			}
			tmp++; // 나누어 떨어질때까지 값 늘려가며 비교
		}
	}
}
