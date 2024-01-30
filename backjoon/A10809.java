import java.util.Scanner;

public class A10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char inputString[] = sc.next().toCharArray(); // 배열에 문자 담기
		int output[] = new int[26];

		for (int i = 0; i < 26; i++) {
			for (int j = 0; j < inputString.length; j++) {
				if ((char)(i + 97) == inputString[j]) {
					output[i] = j;
					break;
				} else {
					output[i] = -1;
				}
			}
		}

		for (int i = 0; i < 26; i++) {
			System.out.print(output[i] + " ");
		}
	}
}
