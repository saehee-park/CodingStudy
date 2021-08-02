package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Guitar1049 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken()); // ²÷¾îÁø°³¼ö
		int m = Integer.parseInt(st.nextToken()); // ±âÅ¸ÁÙºê·£µå

		int set [] = new int [m];
		int one [] = new int [m];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			set[i] = Integer.parseInt(st.nextToken()); // set
			one[i] = Integer.parseInt(st.nextToken()); // one
		}
		Arrays.sort(set);
		Arrays.sort(one);
		int price = Integer.MAX_VALUE;
		
		//°¡Àå ½Ñ 6°³Â¥¸® ÆÑ ±¸¸Å vs °¡Àå ½Ñ ³¹°³ ±¸¸Å vs (°¡Àå½Ñ 6°³Â¥¸® ÆÑ + ³¹°³)
		price = Math.min(((n/6)+1)*set[0], n*one[0]);    
		price = Math.min(price, ((n/6))*set[0] + (n%6)*one[0]);
		
		System.out.println(price);
	}

}
