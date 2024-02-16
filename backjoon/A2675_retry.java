import java.util.Scanner;

public class A2675_retry {
	public static void main(String[] args) {

		// 1. 테스트 케이스 입력 받기
		// 2. 반복 횟수 입력 받기
		// 3. 반복 문자열 입력 받기
		// 4. 문자열을 하나씩 추출
		// 5. 추출한 문자열 출력
		// 6. 문자열 끝나면 종료

		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {
			int repeatCount = sc.nextInt();
			String repeatStr = sc.next();

			for (int j = 0; j < repeatStr.length(); j++) { // 문자열 반복만큼 실행.
				char a = repeatStr.charAt(j);
				for (int k = 0; k < repeatCount; k++) {
					System.out.print(a);
				}
			}
			System.out.println();
		}
	}
}
