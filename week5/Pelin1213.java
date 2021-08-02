package week5;
/*
 * �Ӹ���� ���ڿ��� Ȧ���� �����ϴ� ���ĺ����� 2�� �̻��̸� ���������.
 * ¦������, Ȧ�� �ѹ��� ABCD+C+DCBA �̷������� ��� �־�ż� ����*/
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

		int oddCount = 0;			// �����ϴ� ���ĺ� Ȧ�� ����
		char oddCharacter = '-';	// Ȧ���� �����ϴ� ����

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

		// Ȧ���� ������ ���ĺ��� ���� ��� �߰��� �߰���
		if (oddCount >= 1)
			pelindrom += oddCharacter;

		// ���� ������� �Ӹ���� ���ڿ��� �ݴ�� ��¤�� ���ڿ��� ������
		pelindrom += reverseHalfPelindrom;
		System.out.println(pelindrom);
	}

}
