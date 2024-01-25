import java.util.Scanner;

public class A15649 {

	// GPT 가 풀어줌.. 이해안감...
	static int[] arr; // 해당 순열을 저장하는 배열 // 값을 담을 배열
	static boolean[] visited; // 방문여부 체크하는 배열 (재귀를 하여 이미 방문한 노드라면 다음 노드를 탐색하도록 하기 위함)
	static int N, M; // N,M

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // N 입력받기
		M = sc.nextInt(); // M 입력받기
		arr = new int[M]; // M개의 숫자의 순열을 저장하는 배열 초기화
		visited = new boolean[N + 1]; // 방문 체크하는 배열 초기화

		dfs(0);
		sc.close();
	}

	static void dfs(int depth) {
		if (depth == M) { // 재귀 깊이가 M과 같아지면 탐색과정에서 담았던 배열을 출력
			for (int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
			return; // 재귀함수 특성 상 return을 만나면 가장 최근에 호출된 함수 인스턴스(스택의 맨 위에 있는 것)가 스택에서 제거된다. 즉, depth가 2가 제거되고 다시 1이 된다.
		}

		for (int i = 1; i <= N; i++) {
			if (!visited[i]) { // 만약 해당 노드(값)을 방문하지 않았다면? -> 값이 없다면?
				visited[i] = true; // 해당 노드를 방문상태로 변경 -> turn : 진행시켜!
				arr[depth] = i; // 해당 깊이를 index로 하여 i값 저장
				dfs(depth + 1); // 다음 자식 노드 방문을 위해 depth 1 증가시키면서 재귀 호출
				visited[i] = false; // 자식노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
			}
		}
	}

	// // 27분 실패!
	//
	// Scanner sc = new Scanner(System.in);
	//
	// int n = sc.nextInt();
	// int m = sc.nextInt();
	//
	// int arr[] = new int[m]; // 값을 담을 배열
	//
	// for (int i = 1; i <= n; i++) {
	// 	for (int j = 1; j <= m; j++) {
	// 		if (i == j) {
	// 			continue;
	// 		}
	// 		arr[m - (m - j)] = i;
	// 		arr[m - (m - (m - j + 1))] = j;
	// 	}
	// }
	//
	// for (int i = 1; i <= n; i++) {
	// 	for (int j = 1; j <= m; j++) {
	// 		System.out.println(arr[i]);
	// 	}
	// }

}
