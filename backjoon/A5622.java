import java.util.Scanner;

public class A5622 {
	public static void main(String[] args) {
		int timeCount = 0;

		Scanner sc = new Scanner(System.in);
		char[] input = sc.nextLine().toCharArray();

		// System.out.println(Arrays.toString(input));

		// 배열에 해당하는 것들끼리 묶어
		// 배열 번지수로 검색
		// 배열에 해당하면 count 새어 보아요
		//

		for (int i = 0; i < input.length; i++) {
			timeCount = timeCount + 2;
			if (input[i] == 'A' || input[i] == 'B' || input[i] == 'C') {
				timeCount++;
			} else if (input[i] == 'D' || input[i] == 'E' || input[i] == 'F') {
				timeCount = timeCount + 2;
			} else if (input[i] == 'G' || input[i] == 'H' || input[i] == 'I') {
				timeCount = timeCount + 3;
			} else if (input[i] == 'J' || input[i] == 'K' || input[i] == 'L') {
				timeCount = timeCount + 4;
			} else if (input[i] == 'M' || input[i] == 'N' || input[i] == 'O') {
				timeCount = timeCount + 5;
			} else if (input[i] == 'P' || input[i] == 'Q' || input[i] == 'R' || input[i] == 'S') {
				timeCount = timeCount + 6;
			} else if (input[i] == 'T' || input[i] == 'U' || input[i] == 'V') {
				timeCount = timeCount + 7;
			} else {
				timeCount = timeCount + 8;
			}
		}
		System.out.println(timeCount);
	}
}
