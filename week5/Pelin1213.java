package week5;
/*
 * 팰린드롬 문자열은 홀수번 등장하는 알파벳수가 2개 이상이면 만들수없다.
 * 짝수가능, 홀수 한번도 ABCD+C+DCBA 이런식으로 가운데 넣어도돼서 가능*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pelin1213 {

	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		int[] alphabatCounter = new int[26];

		for (int i = 0; i < str.length; i++) {
			alphabatCounter[str[i] - 'A']++;
		}

		int oddCount = 0;			// 등장하는 알파벳 홀수 갯수
		char oddCharacter = '-';	// 홀수번 등장하는 문자

		for (int i = 0; i < alphabatCounter.length; i++) {
			if (alphabatCounter[i] % 2 == 1) {
				oddCount++;
				oddCharacter = (char)('A' + i);
			}
		}

		if (oddCount > 1) {
			System.out.println("I'm Sorry Hansoo");
			return;
		}

		String pelindrom = "";
		for (int i = 0; i < alphabatCounter.length; i++) {
			for (int j = 0; j < alphabatCounter[i] / 2; j++) {
				pelindrom += (char)('A' + i);
			}
		}

		String reverseHalfPelindrom = new StringBuffer(pelindrom).reverse().toString();

		// 홀수번 등장한 알파벳이 있을 경우 중간에 추가함
		if (oddCount >= 1)
			pelindrom += oddCharacter;

		// 절반 만들어진 팰린드롬 문자열을 반대로 뒤짚은 문자열을 더해줌
		pelindrom += reverseHalfPelindrom;
		System.out.println(pelindrom);
	}

}
