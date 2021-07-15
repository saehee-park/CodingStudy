package week1;

import java.util.Scanner;
import java.util.Vector;

public class Blackjaek2798 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n=0, m=0;
		n = scanner.nextInt(); // 카드갯수
		m = scanner.nextInt();
		
		Vector<Integer> card = new Vector<Integer>();
		
		for(int i=0; i<n; i++) {
			card.add(scanner.nextInt());
		}
		
		int sum = found(card, n, m);
		System.out.println(sum);
	}

	static int found(Vector<Integer> card, int n, int m) {
		
		int sum = 0;
		
		for(int i=0; i<n-2; i++) { // 첫번째 카드라 나머지 두개를 남겨둬야함
			for(int j=i+1; j<n-1; j++) {
				for(int l=j+1; l<n; l++) {
					int tmp = card.get(i) + card.get(j) + card.get(l);
					
					if(tmp == m) {
						return tmp;
					}
					
					if(sum<tmp && tmp<m) {
						sum = tmp;
					}
				}
			}
		}

		return sum;
	}

}
