import java.util.Scanner;

// 시간초과

public class A2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int climb = sc.nextInt(); // 낮에 올라간 높이
		int slip = sc.nextInt(); // 밤에 미끄러진 높이
		int treeHeight = sc.nextInt(); // 나무의 높이
		int snail = 0; // 달팽이의 높이
		int day = 0; // 몇일 지났는지..

		while (true) {
			day++;
			snail += climb;
			if (snail >= treeHeight) {
				break;
			} else {
				snail -= slip;
			}

		}
		System.out.println(day);

	}
}
