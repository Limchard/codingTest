import java.util.Scanner;

public class A1152 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 사용자로부터 한 줄의 문자열 입력 받기
		String input = scanner.nextLine().trim();
		// trim(); 없으면 틀렸다고 나온다.

		// 입력된 문자열이 비어있는 경우, 단어의 개수는 0
		if (input.isEmpty()) { // 입력된 문자열이 비여있는 경우 고려 안하면 틀렸다고 나온다.
			System.out.println(0);
		} else {
			// 공백을 기준으로 문자열 분리
			String[] words = input.split(" ");

			// 분리된 문자열의 개수 출력
			System.out.println(words.length);
		}

		scanner.close();

	}
}
