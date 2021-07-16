package week2;
/*
 * 시간제약이 있어 bf 사용
 * println 보다는 stringbuilder 쓰는게 시간 절약
 * 문제에서 병합정렬, 힙정렬을 사용하는 대신 내장된 정렬 함수 사용하라 해서 collections 사용*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NumSort2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder(); // StringBuilder 사용 후 시간초과 해결
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			num.add(Integer.parseInt(bf.readLine())); // collection 사용시 list 계열 사용
		}
	
		Collections.sort(num); // Arrays 를 사용하면 시간초과 발생
		for(int i : num) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
}
