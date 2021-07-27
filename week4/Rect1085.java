package week4;
/* 직사각형은 (0,0)기준으로 (w,0) (0,h) (w,h)로 이루어져 있음
 * 직사각형의 경계선까지 가기 위해서는 w, h, w-x, h-y의 방법이 있다*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rect1085 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int z = Integer.parseInt(st.nextToken());
		
		int tmp1 = Math.min(x, w-x);
		int tmp2 = Math.min(y, z-y);
		
		int result = Math.min(tmp1, tmp2);
		System.out.println(result);
	}

}
