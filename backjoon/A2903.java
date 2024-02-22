import java.util.Scanner;

public class A2903 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// N을 입력받는다.
		int N = scanner.nextInt();

		// 초기 점의 개수는 2 (한 변에 두 점)
		int pointsPerSide = 2;

		// N번 이동하면서 점의 개수를 업데이트한다.
		for (int i = 0; i < N; i++) {
			// 각 이동마다 변의 점이 2배가 된다.
			pointsPerSide += (pointsPerSide - 1);
		}

		// 총 점의 수는 변의 점의 개수의 제곱이다.
		int totalPoints = pointsPerSide * pointsPerSide;

		// 결과 출력
		System.out.println(totalPoints);

		scanner.close();
	}
}
