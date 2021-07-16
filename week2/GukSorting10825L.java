package week2;
/*
 * 람다식 사용
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GukSorting10825L {
	

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[][] score = new String[n][4]; // 이름, 국어, 영어, 수학
		
		for(int i=0; i<n; i++) {
			String[] split = bf.readLine().split(" ");
			for(int j=0; j<4; j++) {
				score[i][j] = split[j];
			}
		}
		
		Arrays.sort(score, (e1, e2) -> {
			if(Integer.parseInt(e1[1]) != Integer.parseInt(e2[1])) { // 국어 내림차순
				return Integer.compare(Integer.parseInt(e2[1]), Integer.parseInt(e1[1]));
			} else if(Integer.parseInt(e1[2]) != Integer.parseInt(e2[2])) { // 영어 오름차순
				return Integer.compare(Integer.parseInt(e1[2]), Integer.parseInt(e2[2]));
			} else if(Integer.parseInt(e1[3]) != Integer.parseInt(e2[3])) { // 수학 내림차순
				return Integer.compare(Integer.parseInt(e2[3]), Integer.parseInt(e1[3]));
			} else { // 이름 오름차순
				return e1[0].compareTo(e2[0]);
			}
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(score[i][0]);
		}
		
		
	}

}
