package week2;
/*
 * Comparator 사용
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class GukSorting10825C {
	
	public static class Info{
		String name;
		int kor, eng, math;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Info[] info = new Info[n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			info[i] = new Info();
			info[i].name = st.nextToken();
			info[i].kor = Integer.parseInt(st.nextToken());
			info[i].eng = Integer.parseInt(st.nextToken());
			info[i].math = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(info, new Comparator<Info>() {

			@Override
			public int compare(Info o1, Info o2) {
				if(o1.kor == o2.kor && o1.eng == o2.eng && o1.math == o2.math) {
					return o1.name.compareTo(o2.name);
				} else if(o1.kor == o2.kor && o1.eng == o2.eng) {
					return o2.math - o1.math; // 감소
				} else if(o1.kor == o2.kor) {
					return o1.eng - o2.eng; // 증가
				} else {
					return o2.kor - o1.kor; // 감소
				}
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			sb.append(info[i].name).append('\n');
		}
		System.out.println(sb);
		
	}

}
