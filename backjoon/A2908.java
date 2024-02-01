import java.util.Scanner;

public class A2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] input = sc.nextLine().toCharArray();
		char[] number = new char[input.length];

		for (int i = 0; i < input.length; i++) {
			number[i] = input[input.length - (i + 1)];
		}
		// System.out.println(Arrays.toString(number));

		String leftNumber = "";
		String rightNumber = "";

		for (int i = 0; i < 3; i++) {
			leftNumber += number[i];
		}
		for (int i = 4; i < 7; i++) {
			rightNumber += number[i];
		}
		int result = Math.max(Integer.parseInt(leftNumber), Integer.parseInt(rightNumber));
		System.out.println(result);

	}
}
