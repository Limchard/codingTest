import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2869_retry {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		double climb = Integer.parseInt(st.nextToken());
		double slip = Integer.parseInt(st.nextToken());
		double treeHeight = Integer.parseInt(st.nextToken());
		double snail = 0; // 달팽이의 높이

		double day = (treeHeight - slip) / (climb - slip); // 4/1==4   ,5/4 // 올림표현!!
		
		System.out.println((int)Math.ceil(day));

		br.close();

	}
}
