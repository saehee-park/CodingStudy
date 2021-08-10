package week5;
/*
 * 들어오는 값이 커지기 때문에 BigInteger 사용*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Buho1247 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		BigInteger zero = new BigInteger("0");
		
		for(int j=0; j<3; j++) {
			n = Integer.parseInt(br.readLine());
			BigInteger s = zero;
			
			for(int i=0; i<n; i++) {
				BigInteger now = new BigInteger(br.readLine());
				s = s.add(now);
			}
			
			if(s.compareTo(zero)==0) {
				System.out.println(0);
			} else if (s.compareTo(zero)==1) { // 양수이면
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		}
	}
}
