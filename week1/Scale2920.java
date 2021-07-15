package week1;

import java.util.ArrayList;
import java.util.Scanner;

public class Scale2920 {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<8; i++) {
			arrayList.add(scanner.nextInt());
		}
		
		ArrayList asc = new ArrayList();
		for(int i=1; i<9; i++) {
			asc.add(i);
		}
		
		ArrayList dsc = new ArrayList();
		for(int i=8; i>0; i--) {
			dsc.add(i);
		}
		
		if(arrayList.equals(asc)) {
			System.out.println("ascending");
		} else if(arrayList.equals(dsc)) {
			System.out.println("desending");
		} else {
			System.out.println("mixed");
		}
		
		
	}

}
