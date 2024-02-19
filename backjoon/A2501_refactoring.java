import java.util.Scanner;

public class A2501_refactoring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int naturalNumber = sc.nextInt(); // N 입력 받기
		int orderNumber = sc.nextInt(); // K 입력 받기
		int count = 0; // 약수를 세기 위한 카운터

		for (int i = 1; i <= naturalNumber; i++) {
			if (naturalNumber % i == 0) { // i가 N의 약수라면
				count++; // 약수 카운트 증가
				if (count == orderNumber) { // K번째 약수라면
					System.out.println(i); // i 출력
					return; // 프로그램 종료
				}
			}
		}

		System.out.println(0); // K번째 약수가 없는 경우 0 출력
	}
}
