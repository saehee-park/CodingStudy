package week2;
/*
 * �ð������� �־� bf ���
 * println ���ٴ� stringbuilder ���°� �ð� ����
 * �������� ��������, �������� ����ϴ� ��� ����� ���� �Լ� ����϶� �ؼ� collections ���*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NumSort2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder(); // StringBuilder ��� �� �ð��ʰ� �ذ�
		ArrayList<Integer> num = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			num.add(Integer.parseInt(bf.readLine())); // collection ���� list �迭 ���
		}
	
		Collections.sort(num); // Arrays �� ����ϸ� �ð��ʰ� �߻�
		for(int i : num) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
}
