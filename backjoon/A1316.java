import java.util.Scanner;

public class A1316 {

	// 그룹단어 찾기
	// 단어에 알파벳 중복 없는 것 찾기

	public static void main(String[] args) {
		// 1. 배열에 문자 각각 담기
		// 2. 기입된 배열에서 값 찾기
		// 3. 이전에 포함되었는지 확인하기

		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();
		int checkerCount = testCase;

		for (int i = 0; i < testCase; i++) {
			char checkers[] = sc.next().toCharArray();
			for (int j = 1; j < checkers.length; j++) {
				boolean breakPoint = true;
				for (int k = 0; k < j; k++) {
					if (checkers[j] != checkers[j - 1] && checkers[j] == checkers[k]) {
						checkerCount--;
						breakPoint = false;
						break;
					}
				}
				if (breakPoint == false) {
					break;
				}
			}
		}

		System.out.println(checkerCount);

	}
}
