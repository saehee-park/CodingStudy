package week5;
//앞에서부터 비교해서 가장 차이가 적은부분에 위치할때 나머지는 맞는걸로 채워주면됨
import java.util.Scanner;

public class Word1120 {

	 public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       String a = sc.next();
	       String b = sc.next();
	       
	       String[] a1 = a.split("");
	       String[] b1 = b.split("");
	       
	       int leng = b1.length - a1.length; // 두개 문자길이 차이
	       int num = a1.length;
	       
	       for(int i = 0; i<=leng; i++) {
	    	   int count = 0;
	    	   for(int j = 0; j<a1.length; j++) {
	    		   if(!a1[j].equals(b1[i+j]))
	    			   count++;
	    	   }
	    	   if(num>count)
	    		   num = count;
	       }
	       System.out.println(num);
	    }
	}
