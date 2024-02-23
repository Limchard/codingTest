import java.util.Arrays;
import java.util.Scanner;

public class A2587_2 {
	public static void main(String[] args) {
		// 다섯개 값이 주어졌을 때 평균과 중간값을 구하는 프로그램을 작성하라
		Scanner sc = new Scanner(System.in);

		int inputNumber[] = new int[5];
		int total = 0;

		for (int i = 0; i < 5; i++) {
			inputNumber[i] = sc.nextInt();
			total += inputNumber[i];
		}
		int average = total / 5;

		Arrays.sort(inputNumber);

		System.out.print(average + "\n" + inputNumber[2]);

	}
}