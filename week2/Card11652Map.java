package week2;
/*
 * ī�忡 �����ִ� �� ������ �ʹ� Ŀ�� 
 * �迭�� ����⿣ ������, Map,HashMap�� ����ؾ��Ѵ�
 * HashMap:Map�ȿ��� key/value�� ���� ���� ����
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
			map.put(temp, map.getOrDefault(temp,0)+1); // temp�� �ش��ϴ� ���� ������ 0ȣ��
			max = Math.max(map.get(temp), max); // �Է� �����鼭 �ִ밪 ���� | temp���� max�� �ִ밪 ��ȯ
		}
		
		List<Long> list = new LinkedList<>();
		for(Map.Entry<Long, Integer> entry: map.entrySet()) {
			if(entry.getValue() == max) {
				list.add(entry.getKey()); // list�� �ִ밪�� Ű �ֱ�
			}
		}
		
		Collections.sort(list);
		System.out.println(list.get(0));
	}
}
