import java.util.Scanner;

public class A10988 {
	public static void main(String[] args) {
		// 팰린드롬이냐 아니냐..
		// 팰린드롬 아 확인
		Scanner sc = new Scanner(System.in);

		// 배열로 입력? 그냥 split으로 뽑아도 될 듯 하긴 함... 일단 배열로 풀어보자.
		// 가장앞, 가장 뒤부터 순차적으로 비교해서 맞으면 1 출력, 틀리면 0 출력

		char[] input = sc.nextLine().toCharArray();
		int count = 0;

		for (int i = 0; i < input.length / 2; i++) {
			if (input[i] == input[input.length - i - 1]) {
				count++;
			}
		}

		if (count == input.length / 2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}
}
