import java.util.Scanner;

public class A1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 입력받은 단어를 모두 대문자로 변환
		String input = sc.next().toUpperCase();

		// 알파벳 사용 횟수를 저장할 배열
		int[] count = new int[26];

		// 입력받은 단어의 각 문자에 대해 사용 횟수 카운트
		for (int i = 0; i < input.length(); i++) {
			count[input.charAt(i) - 'A']++;
		}

		int max = -1; // 가장 많이 사용된 알파벳의 사용 횟수
		char result = '?'; // 결과값을 저장할 변수

		for (int i = 0; i < 26; i++) {
			if (count[i] > max) {
				max = count[i];
				result = (char)(i + 'A');
			} else if (count[i] == max) {
				result = '?';
			}
		}
		// 결과 출력
		System.out.println(result);
	}
}