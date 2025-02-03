import java.util.Scanner;

public class A1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 갯수 입력
		int primeNumberCount = 0;

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt(); // 숫자 입력
			if (a == 1) {
				continue;
			}
			if (a == 2) {
				primeNumberCount++;
				continue;
			}

			int count = 2;
			for (int j = 2; j < a; j++) // 소수 판별
			{
				if (a % j == 0) // 나눠지면
				{
					continue;
				} else
					count++;

				if (a == count) {
					primeNumberCount++;
				}
			}
		}
		System.out.println(primeNumberCount);

	}
}
