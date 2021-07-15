package week2;

import java.util.*;

class Main{
    public static void main(String[] args) {
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	Scanner scanner = new Scanner(System.in);
    	int cnt = scanner.nextInt();
    	
    	for(int i=0; i<cnt; i++) {
    		int num = scanner.nextInt();
    		list.add(num);
    	}
    	Collections.sort(list);
    	for(int i:list) {
    		System.out.println(i);
    	}
    	scanner.close();
    }
}