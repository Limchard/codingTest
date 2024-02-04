// import java.util.Scanner;
//
// public class A11718 {
// 	public static void main(String[] args) {
// 		// buffer 에 담아놓고, 한번에 출력 쫘르륵!
// 		// 입력 받은대로 출력하기
// 		// 입력받기
// 		// 출력하기
// 		// 하지만.. 종료가 없다
// 		// 즉, 입력 받은대로 출력하고 알아서 종료 되어야 한다?
// 		// 입력은 최대 100줄이다.
// 		// 한번 입력, 한번 출력인데... 엔터로 구분 X ? 이게 가능해?
// 		// 입력을 엔터 기준으로 계속 받아야 하나?
//
// 		Scanner sc = new Scanner(System.in);
//
// 		while (true) {
// 			String input = sc.nextLine();
// 			System.out.println(input);
//
// 		}
// 	}
// }

import java.util.Scanner;

public class A11718 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			System.out.println(input);
		}
	}
}
