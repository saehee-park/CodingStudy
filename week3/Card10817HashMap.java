package week3;
/*
 * HashMap ������� �ð��ʰ� �ذ� */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Card10817HashMap {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // ī�� ����
		
		HashMap<Integer, Integer> map = new HashMap<>();
		String[] input = bf.readLine().split(" ");
		
		for(int i=0; i<n; i++) {
			int cardsnum = Integer.parseInt(input[i]);
			if(map.containsKey(cardsnum)) {
				map.put(cardsnum, map.get(cardsnum)+1);
			} else {
				map.put(cardsnum, 1);
			}
		}
		
		int m = Integer.parseInt(bf.readLine());
		input = bf.readLine().split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<m; i++) {
			int findnum = Integer.parseInt(input[i]);
			if(map.containsKey(findnum)) {
				sb.append(map.get(findnum));
			} else {
				sb.append("0");
			}
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
