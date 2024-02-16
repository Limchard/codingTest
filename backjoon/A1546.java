import java.util.Arrays;
import java.util.Scanner;

public class A1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int subjectCount = sc.nextInt(); // 과목 수 입력
		double subjectScore[] = new double[subjectCount]; // 각 과목 점수 입력 받을 배열
		double totalScore = 0; // 각 점수의 합 담아놓을 변수

		for (int i = 0; i < subjectCount; i++) {
			subjectScore[i] = sc.nextInt(); // 각 과목 점수 입력 받기
			totalScore += subjectScore[i]; // 각 점수의 총 합을 위해 점수 다 더하기
		}
		Arrays.sort(subjectScore); // 과목 오름차순 정렬
		// System.out.println(Arrays.toString(subjectScore));

		// 평균 구하기
		double average = totalScore / subjectCount; // 여기서 뭔가 삑난다는 말인데..
		// System.out.println(average);
		// System.out.println(totalScore);

		System.out.println((average / subjectScore[subjectCount - 1]) * 100);

	}
}
