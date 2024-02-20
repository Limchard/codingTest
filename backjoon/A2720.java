import java.util.Scanner;

public class A2720 {
	public static void main(String[] args) {
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;

		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {

			int quarterCount = 0;
			int dimeCount = 0;
			int nickelCount = 0;
			int pennyCount = 0;

			int change = sc.nextInt();

			while (change >= quarter) {
				change = change - quarter;
				quarterCount++;
			}
			while (change >= dime) {
				change = change - dime;
				dimeCount++;
			}
			while (change >= nickel) {
				change = change - nickel;
				nickelCount++;
			}
			while (change >= penny) {
				change = change - penny;
				pennyCount++;
			}
			System.out.println(quarterCount + " " + dimeCount + " " + nickelCount + " " + pennyCount + " ");
		}
	}
}
