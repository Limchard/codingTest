import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A14215 {
	public static void main(String[] args) {
		// 길이를 줄일 수 있다.
		// 삼각형이 가장 긴 변의 길이보다 나머지 변 길이의 합이 커야 한다.

		Scanner sc = new Scanner(System.in);
		Integer input[] = new Integer[3];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}

		// 배열 내림차순 정렬
		Arrays.sort(input, Collections.reverseOrder());

		if (input[0] == input[1] + input[2]) {
			input[0] = input[1] + input[2] - 1;
			System.out.println(input[0] + input[1] + input[2]);
		} else if (input[0] > input[1] + input[2]) {
			input[0] = input[1] + input[2] - 1;
			System.out.println(input[0] + input[1] + input[2]);
		} else {
			System.out.println(input[0] + input[1] + input[2]);
		}
	}
}
