import java.util.Scanner;

public class A10988_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // 사용자로부터 문자열 입력 받기
		boolean isPalindrome = true; // 팰린드롬인지 아닌지를 저장할 변수, 초기값은 true

		for (int i = 0; i < input.length() / 2; i++) { // 문자열의 절반만큼만 반복
			if (input.charAt(i) != input.charAt(input.length() - i - 1)) { // 앞뒤 문자 비교
				isPalindrome = false; // 하나라도 다르면 팰린드롬이 아님
				break; // 더 이상 확인할 필요가 없으므로 반복문 탈출
			}
		}

		if (isPalindrome) {
			System.out.println(1); // 팰린드롬이면 1 출력
		} else {
			System.out.println(0); // 팰린드롬이 아니면 0 출력
		}

		sc.close(); // 스캐너 자원 해제
	}
}