import java.util.Scanner;

public class A2501 {
	public static void main(String[] args) {
		// 입력숫자 2개
		// 약수를 저장할 배열
		// 	나눠서 0이 되면 해당 값 배열에 할당
		// 	해당 번지수 출력

		Scanner sc = new Scanner(System.in);
		int naturalNumber = sc.nextInt();
		int orderNumber = sc.nextInt();
		int divisor[] = new int[naturalNumber];
		int arrayCount = 0; // 배열 번지수 number;

		for (int i = 1; i <= naturalNumber; i++) {
			if (naturalNumber % i == 0) {
				divisor[arrayCount] = i;
				arrayCount++;
			} else if (divisor[orderNumber - 1] != 0) {
				break;
			}

		}

		if (divisor[orderNumber - 1] == 0) {
			System.out.println(0);
		} else {
			System.out.println(divisor[orderNumber - 1]);
		}

	}
}
