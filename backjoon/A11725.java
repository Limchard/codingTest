import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A11725 {
	static ArrayList<Integer>[] adjList;
	static int[] parent;
	static boolean[] visited;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		adjList = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			adjList[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < N - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			adjList[a].add(b);
			adjList[b].add(a);
		}

		parent = new int[N + 1];
		visited = new boolean[N + 1];

		bfs(1);

		StringBuilder sb = new StringBuilder();
		for (int i = 2; i <= N; i++) {
			sb.append(parent[i]).append('\n');
		}
		System.out.println(sb);
	}

	public static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int node = queue.poll();

			for (int nextNode : adjList[node]) {
				if (!visited[nextNode]) {
					parent[nextNode] = node;
					visited[nextNode] = true;
					queue.offer(nextNode);
				}
			}
		}
	}
}
