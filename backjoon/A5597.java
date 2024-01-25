import java.util.Arrays;
import java.util.Scanner;

public class A5597 {
	public static void main(String[] args) {

		// 학생 번호 담기
		// for (int i = 0; i < 28; i++) {
		// 	int number = sc.nextInt();
		// 	attendanceNumber[i] = number;
		// }
		//
		// Arrays.sort(attendanceNumber); // 오름차순 정렬
		// // System.out.println(Arrays.toString(attendanceNumber));
		//
		// for (i = 0; i < attendanceNumber.length; i++) {
		// 	if (studentCount != attendanceNumber[i]) {
		// 		System.out.println(studentCount);
		// 		break;
		// 	} else {
		// 		studentCount++;
		// 	}
		// }
		//
		// for (int j = i + 1; j < attendanceNumber.length; j++) {
		// 	if (studentCount != attendanceNumber[j]) {
		// 		System.out.println(studentCount);
		// 		break;
		// 	} else {
		// 		studentCount++;
		// 	}
		// }

		Scanner sc = new Scanner(System.in);

		int attendanceNumber[] = new int[28]; // 처음 입력받을 배열값
		int hoi[] = new int[30]; // 최종 정리할 배열 값
		int j = 0;

		// 학생 번호 담기
		for (int i = 0; i < 28; i++) {
			int number = sc.nextInt();
			attendanceNumber[i] = number;
		}

		Arrays.sort(attendanceNumber);

		for (int i = 0; i < attendanceNumber.length + 1; i++) {
			if (i == 28) {
				System.out.println(29);
				j = 28;
				break;
			} else if (attendanceNumber[i] != i + 1) {
				System.out.println(i + 1);
				j = i + 1;
				break;
			}
		}
		for (int i = j; i < attendanceNumber.length + 1; i++) {
			if (i == 28) {
				System.out.println(30);
				break;
			} else if (attendanceNumber[i] != i + 2) {
				System.out.println(i + 2);
				break;
			}
		}

	}

	// -8 분 ㅅㅂ ?
}
