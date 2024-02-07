import java.util.Scanner;

public class A10811 {
	public static void main(String[] args) {
		// // 배열 생성해서 값 담기
		// Scanner sc = new Scanner(System.in);
		//
		// int basketCount = sc.nextInt(); // 바구니 갯수 입력
		// int repeat = sc.nextInt(); // 반복 횟수 입력
		//
		// int basket[] = new int[basketCount]; // 바구니로 사용될 배열 생성
		// int temp[] = new int[basketCount]; // 숫자 변경시 사용 될 빈 배열
		//
		// for (int i = 0; i < basketCount; i++) { // 배열에 숫자 담기
		// 	basket[i] = i + 1;
		// 	temp[i] = i + 1;
		// }
		//
		// // System.out.println(Arrays.toString(basket));
		//
		// for (int i = 0; i < repeat; i++) {
		// 	int startBasket = sc.nextInt();
		// 	int endBasket = sc.nextInt();
		// 	for (int j = startBasket - 1; j <= endBasket - 1; j++) {
		// 		temp[endBasket - 1 - j] = basket[j]; // 해당하는 범위 temp에 넣기
		// 	}
		// 	for (int j = startBasket - 1; j < endBasket; j++) {
		// 		basket[j] = temp[j]; // 다시 집어넣기
		// 	}
		// }
		//
		// for (int i = 0; i < basketCount; i++) {
		// 	System.out.print(basket[i] + " ");
		// }

		Scanner sc = new Scanner(System.in);
		int basketCount = sc.nextInt() + 1; // 바구니 갯수 입력
		int repeat = sc.nextInt(); // 반복 횟수 입력

		int basket[] = new int[basketCount]; // 바구니로 사용될 배열 생성
		int temp[] = new int[basketCount]; // 숫자 변경시 사용 될 빈 배열

		for (int i = 0; i < basketCount; i++) { // 배열에 숫자 담기
			basket[i] = i;
			temp[i] = i;
		}

		// 역순 진행
		for (int i = 0; i < repeat; i++) {
			int startBasket = sc.nextInt(); //
			int endBasket = sc.nextInt();

			int count = endBasket;

			for (int j = startBasket; j <= endBasket; j++) {
				temp[count] = basket[j];
				count--;
			}
			for (int j = 0; j < basketCount; j++) {
				basket[j] = temp[j];
			}

		}
		for (int i = 1; i < basketCount; i++) {
			System.out.print(basket[i] + " ");
		}
	}
}
