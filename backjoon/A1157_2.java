import java.util.Scanner;

public class A1157_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] alphabet = new int[26]; // 알파벳은 총 26개 이다.
		String input = sc.next();

		for (int i = 0; i < input.length(); i++) {
			if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') { // 대문자 범위
				alphabet[input.charAt(i) - 'A']++; // 해당 인덱스의 값 1 증가
			} else { // 소문자 범위
				alphabet[input.charAt(i) - 'a']++;
			}
		}

		int max = -1;
		char ch = '?';

		for (int i = 0; i < 26; i++) {
			if (alphabet[i] > max) {
				max = alphabet[i];
				ch = (char)(i + 65);
			} else if (alphabet[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);

	}
}
