import java.util.ArrayList;
import java.util.Scanner;

public class A9506 {
	public static void main(String[] args) {
		// 숫자가 주어지면 완전수 인지 확인해라
		// 완전수 : 주어진 수를 제외한 모든 약수들의 합이 주어진 수와 동일할 경우
		// 예시 : 6 -> 1+2+3=6;
		// 입력의 마지막엔 -1 입력

		Scanner sc = new Scanner(System.in);

		while (true) {
			int hyperfectNumber = sc.nextInt();
			if (hyperfectNumber == -1) {
				break;
			}
			ArrayList<Integer> divisors = new ArrayList<>();
			int sumNumber = 0;

			for (int i = 1; i < hyperfectNumber; i++) {
				if (hyperfectNumber % i == 0) {
					divisors.add(i);
				}
			}

			for (int j = 0; j < divisors.size(); j++) {
				sumNumber += divisors.get(j);
			}

			if (sumNumber == hyperfectNumber) {
				System.out.print(sumNumber + " = ");
				for (int j = 0; j < divisors.size(); j++) {
					if (j != (divisors.size() - 1)) {
						System.out.print(divisors.get(j) + " + ");
					} else {
						System.out.print(divisors.get(j));
					}
				}
			} else {
				System.out.print(hyperfectNumber + " is NOT perfect.");
			}

			System.out.println();

		}
	}
}
