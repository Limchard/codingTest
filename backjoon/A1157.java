import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A1157 {
	public static void main(String[] args) {
		// 가장 많이 사용된 알파벳 찾기.
		// 알파벳이 복수일 경우 ? 출력

		// 1. 알파벳 입력 받기
		// 2. 알파벳 분류 (아스키코드 활용), 대소문자 구분 안함
		// 	2-1. 입력받은 알파벳을 순회하면서 체크. 이때 배열 활용.
		// 	2-2. 해당하는 알파벳 배열에 count++;
		// 3. 	배열 오름차순 정렬, 또는 다시 순회하면서 최대값 같기
		// 4. 해당하는 알파벳 출력

		Scanner sc = new Scanner(System.in);

		char[] input = sc.next().toCharArray();
		// System.out.println(Arrays.toString(input));
		// System.out.println(input[0]);
		// System.out.println(input[1]);
		// A = 65, a=97 : 32차이
		// Z = 90, z=122 : 32 차이,
		// 알파벳은 25개

		// int[] alphabet = new int[26]; // 알파벳 갯수에 대한 배열
		char[] alphabet = new char[26];
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = 'A';
		}

		Integer[] result = new Integer[26];
		for (int i = 0; i < result.length; i++) {
			result[i] = 0;
		}

		// System.out.println(Arrays.toString(result));

		for (int i = 0; i < input.length; i++) {
			if (input[i] > 90) {
				input[i] = (char)(input[i] - 32);
				// System.out.println(input[i]);
				for (int j = 0; j < 26; j++) {
					if (input[i] == alphabet[j]) {
						result[j]++;
					}
				}
			}
		}

		Arrays.sort(result, Collections.reverseOrder()); // 이게 null을 감당 못함.
		System.out.println(Arrays.toString(result));
		if (result[0] == result[1]) {
			System.out.println("?");
		} else {
			System.out.println(result[0]);
		}

	}
}
