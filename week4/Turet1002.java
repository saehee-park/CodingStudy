package week4;

import java.util.Scanner;

public class Turet1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			System.out.println(marin(x1, y1, r1, x2, y2, r2));
		}
		sc.close();
	}

	private static int marin(int x1, int y1, int r1, int x2, int y2, int r2) {

		int distancepow = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); // 중점간 거리 제곱값
		
		// case1 : 중점이 같으면서 반지름도 같을 경우 (겹칠경우)
		if(x1 == x2 && y1==y2 && r1==r2) {
			return -1; // 위치의 개수 무한대
		}
		
		// case2-1 : 두 원의 반지름 합보다 중점간 거리가 더 길때 (겹치지않을때)
		else if(distancepow > Math.pow(r1+r2, 2)) {
			return 0;
		}
		
		// case2-2 : 원안에 원이 있지만 내접하지 않을때 (겹치지않을때)
		else if(distancepow < Math.pow(r1-r2, 2)) {
			return 0;
		}
		
		// case3-1 : 내접할때
		else if(distancepow == Math.pow(r1-r2, 2)) {
			return 1;
		}
		
		// case3-2 : 외접할때
		else if(distancepow == Math.pow(r1+r2, 2)) {
			return 1;
		}
		
		else { // 위 조건이 아니라면 접점은 두개다
			return 2;
		}
	}

}
