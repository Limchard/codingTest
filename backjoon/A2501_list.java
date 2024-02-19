import java.util.ArrayList;
import java.util.Scanner;

public class A2501_list {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int naturalNumber = scanner.nextInt(); // N 입력 받기
		int orderNumber = scanner.nextInt(); // K 입력 받기
		ArrayList<Integer> divisors = new ArrayList<>(); // N의 약수를 저장할 리스트

		// N의 약수를 찾아서 리스트에 추가
		for (int i = 1; i <= naturalNumber; i++) {
			if (naturalNumber % i == 0) {
				divisors.add(i);
			}
		}

		// K번째 약수 출력하기
		if (divisors.size() >= orderNumber) {
			System.out.println(divisors.get(orderNumber - 1)); // K번째 약수 출력 (인덱스는 0부터 시작)
		} else {
			System.out.println(0); // 약수의 개수가 K보다 적을 경우 0 출력
		}

		scanner.close();
	}
}
