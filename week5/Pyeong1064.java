package week5;
/*
 * https://velog.io/@pss407/%EB%B0%B1%EC%A4%801064-%ED%8F%89%ED%96%89%EC%82%AC%EB%B3%80%ED%98%95
 * 왜 틀렸다고 나오는지 알아보기 */
import java.util.Scanner;

public class Pyeong1064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[3];
		int y[] = new int[3];
		
		for(int i=0; i<3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		double[] leng = new double[3];
		
		if((y[1]-y[0])*(x[2]-x[1]) == (x[1]-x[0])*y[2]-y[1]) {
			System.out.println(-1.0);
		} else {
			double one = Math.sqrt(Math.pow(y[1]-y[0], 2)+Math.pow(x[1]-x[0], 2));
			double two = Math.sqrt(Math.pow(y[2]-y[0], 2)+Math.pow(x[2]-x[0], 2));
			double three = Math.sqrt(Math.pow(y[2]-y[1], 2)+Math.pow(x[2]-x[1], 2));
			
			leng[0] = one+two;
			leng[1] = two+three;
			leng[2] = three+one;
			
			for(int i=0; i<3; i++) {
				if (min > leng[i])
					min = leng[i];
				if (max < leng[i])
					max = leng[i];
            }
			
			System.out.println(2*max-2*min);
			sc.close();
		}
	}

}
