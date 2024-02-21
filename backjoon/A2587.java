import java.util.Arrays;
import java.util.Scanner;

public class A2587 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[5];
		int sum = 0;

		// 5개의 숫자 입력 받기
		for (int i = 0; i < 5; i++) {
			numbers[i] = sc.nextInt();
			sum += numbers[i]; // 합계 계산
		}

		// 배열 정렬
		Arrays.sort(numbers);

		// 평균값 계산 (합계 / 숫자 개수)
		int average = sum / 5;

		// 중앙값 찾기 (정렬된 배열의 가운데 값)
		int median = numbers[2];

		// 평균값과 중앙값 출력
		System.out.println(average);
		System.out.println(median);

		sc.close();
	}
}
