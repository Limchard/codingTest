import java.util.Scanner;

public class A1157_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] alphabet = new int[26]; // 알파벳은 총 26개 이다.
		String input = sc.next();

		for (int i = 0; i < input.length(); i++) {
			if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') { // 대문자 범위
				alphabet[input.charAt(i) - 'A']++; // 해당 인덱스의 값 1 증가

				// System.out.println(input.charAt(i)); // 이러면 문자 출력
				// System.out.println(input.charAt(i) - 'A'); // 이러면 아스키코드가 출력 되는구나...

			} else { // 소문자 범위
				alphabet[input.charAt(i) - 'a']++;
			}
		}
		int max = -1;
		char result = '?';

		for (int i = 0; i < 26; i++) {
			if (alphabet[i] > max) {
				max = alphabet[i];
				// System.out.println("ch1: " + ch); // ? 표 출력.. 왜?
				result = (char)(i + 65);
				// System.out.println("ch2: " + ch); // 문자 출력; 위에서 타입을 char 로 지정했으니까
			} else if (alphabet[i] == max) {
				result = '?';
			}
		}
		System.out.println(result);

	}
}
