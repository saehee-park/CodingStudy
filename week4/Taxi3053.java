package week4;
/*
 * �ý� �����п����� ���� �������̴�(���������� �Ÿ���  �����̸� �������� �������� ��ǥ��)
 * ������ ���� = �Ѵ밢��*�ٸ��밢��/2 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taxi3053 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		
		double uarea = r*r*Math.PI; // ��r^2
		double taxiarea = (2*r)*(2*r)/2;
		
		System.out.println(String.format("%.6f", uarea));
		System.out.println(String.format("%.6f", taxiarea));
	}

}
