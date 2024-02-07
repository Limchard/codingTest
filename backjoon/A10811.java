import java.util.Scanner;

public class A10811 {
	public static void main(String[] args) {

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
