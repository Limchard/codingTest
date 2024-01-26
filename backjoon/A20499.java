import java.util.Scanner;
import java.util.StringTokenizer;

public class A20499 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String KDH[] = new String[3];

		StringTokenizer st = new StringTokenizer(sc.next());
		for (int i = 0; i < 3; i++) {
			KDH[i] = st.nextToken("/");
		}

		int K = Integer.parseInt(KDH[0]);
		int D = Integer.parseInt(KDH[1]);
		int A = Integer.parseInt(KDH[2]);

		if (K + A < D || D == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}
}
