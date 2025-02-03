import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> fibonacciList = new ArrayList<>();
		fibonacciList.add(0);
		fibonacciList.add(1);

		if (n == 0)
			System.out.println(fibonacciList.get(0));
		else if (n == 1)
			System.out.println(fibonacciList.get(1));
		else {
			if (n != 0 || n != 1) {
				for (int i = 2; i <= n; i++) {
					fibonacciList.add(i, fibonacciList.get(i - 2) + fibonacciList.get(i - 1));
				}
				System.out.println(fibonacciList.get(n));
			}
		}
	}
}