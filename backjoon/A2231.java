import java.util.Scanner;

public class A2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 분해합 N 입력 받음
		int result = 0;

		for (int i = 1; i < N; i++) {
			int number = i;
			int sum = 0; // 각 자리수의 합을 저장할 변수

			while (number != 0) {
				sum += number % 10; // 현재 자릿수를 더함
				number /= 10; // 다음 자릿수로 이동
			}

			if (sum + i == N) { // i와 각 자리수의 합이 N과 같다면
				result = i;
				break; // 가장 작은 생성자를 찾았으므로 반복 종료
			}
		}

		System.out.println(result); // 결과 출력
	}
}
