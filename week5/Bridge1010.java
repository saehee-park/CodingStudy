package week5;
// mCn
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bridge1010 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		
		StringTokenizer st = null;
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(bf.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			long sum=1;
			for(int j=m; j>n; j--) {
				sum *= j;
				sum /= m-j+1;
			}
			System.out.println(sum);
		}
		bf.close();
	}

}
