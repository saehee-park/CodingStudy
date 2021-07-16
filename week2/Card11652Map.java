package week2;
/*
 * 카드에 적혀있는 수 범위가 너무 커서 
 * 배열로 만들기엔 무적합, Map,HashMap을 사용해야한다
 * HashMap:Map안에서 key/value에 따른 순서 없음
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Card11652Map {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		Map<Long,Integer> map = new HashMap<Long, Integer>();
		int max = 0;
		
		for(int i=0; i<n; i++) {
			long temp = Long.parseLong(bf.readLine());
			map.put(temp, map.getOrDefault(temp,0)+1); // temp에 해당하는 값이 없으면 0호출
			max = Math.max(map.get(temp), max); // 입력 받으면서 최대값 갱신 | temp값과 max중 최대값 반환
		}
		
		List<Long> list = new LinkedList<>();
		for(Map.Entry<Long, Integer> entry: map.entrySet()) {
			if(entry.getValue() == max) {
				list.add(entry.getKey()); // list에 최대값의 키 넣기
			}
		}
		
		Collections.sort(list);
		System.out.println(list.get(0));
	}
}
