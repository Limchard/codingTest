import java.util.Scanner;

public class A2903_retry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int orderNumber = sc.nextInt();
		int number = 2;

		for (int i = 1; i <= orderNumber; i++) {

			number += (number - 1);

		}

		System.out.println((int)Math.pow(number, 2));
	}
}
