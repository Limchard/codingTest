import java.util.Scanner;

public class A2675 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt(); // 테스트 케이스 수 입력 받기

		for (int i = 0; i < testCase; i++) {
			int repeatCount = sc.nextInt(); // 각 테스트 케이스의 반복횟수
			String inputStr = sc.next(); // 반복할 문자열
			// sc.next()는 가능하고, sc.nextLine() 은 불가능 함 ...
			// 백준 문제의 입력란 보면 repeatCount와 inputStr을 띄어쓰기 기준으로 구분한다. 즉, 한 줄에 입력된다.
			// 이때 nextLine() 은 줄바꿈으로 입력받는 것을 구분 하는데, 띄어쓰기로 구분하는 이번 문제의 input에 대해 이해하지 못하고 에러가 난다.
			for (int j = 0; j < inputStr.length(); j++) {
				for (int k = 0; k < repeatCount; k++) {
					System.out.print(inputStr.charAt(j)); // 각 문자를 반복 횟수만큼 출력
				}
			}
			System.out.println(); // 줄바꿈
		}
		sc.close();

	}

}
