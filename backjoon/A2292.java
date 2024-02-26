import java.util.Scanner;

public class A2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inputNumber = sc.nextInt();
		int count = 0;
		// int count2 = 0;
		int result = 0;

		// 1, 6, 12, 18 .... 6의 배수로 늘어나네, 갯수잖아?

		// while (inputNumber > count) {
		// 	count++;
		// 	if (count == 1) {
		// 		result = 1;
		// 		break;
		// 	} else if (inputNumber >= 2 && inputNumber <= 7) {
		// 		result = 2;
		// 		break;
		// 	} else {
		// 		count2 += count * count2;
		// 		result = inputNumber / count2;
		// 	}
		//
		// }
		// System.out.println(result);

		// if (count == 1) {
		// 	result = 1;
		// } else if (inputNumber >= 2 && inputNumber <= 7) {
		// 	result = 2;
		// }

		for (int i = 0; i < inputNumber; i++) {
			count += 6 * i;
			result++;
			if (count + 1 >= inputNumber) {
				break;
			}

		}
		// System.out.println(count);
		System.out.println(result);

	}
}
