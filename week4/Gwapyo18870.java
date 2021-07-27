package week4;
/*
 * HashMap 사용해서 키값과 벨류값으로 나눠야지 시간초과 안뜸*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Gwapyo18870 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for(int i = 0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int[] tmp = arr.clone(); // 클론 만들어 저장
		Arrays.sort(tmp);
		
		Map<Integer, Integer> map = new HashMap<>();
		int count =0;
		for(int i=0; i<tmp.length; i++) {
			if(!map.containsKey(tmp[i])) { // map 안에 없으면
				map.put(tmp[i], count++);
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			sb.append(map.get(arr[i])).append(" ");
		}
		System.out.println(sb.toString());
	}
}
