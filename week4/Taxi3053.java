package week4;
/*
 * 택시 기하학에서의 원은 마름모이다(두점사이의 거리는  직선이며 마름모의 꼭짓점은 좌표위)
 * 마름모 넓이 = 한대각선*다른대각선/2 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taxi3053 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		
		double uarea = r*r*Math.PI; // ㅍr^2
		double taxiarea = (2*r)*(2*r)/2;
		
		System.out.println(String.format("%.6f", uarea));
		System.out.println(String.format("%.6f", taxiarea));
	}

}
