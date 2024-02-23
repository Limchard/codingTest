import java.util.Arrays;
import java.util.Scanner;

public class A25305 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int scoreCount = sc.nextInt();
		int cutOfScore = sc.nextInt();
		int score[] = new int[scoreCount];

		for (int i = 0; i < scoreCount; i++) {
			score[i] = sc.nextInt();
		}

		Arrays.sort(score);

		System.out.println(score[scoreCount - cutOfScore]);

	}
}
