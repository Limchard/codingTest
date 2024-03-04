import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();


		int testCase=Integer.parseInt(br.readLine());
		int number[]=new int[testCase];

		for (int i=0;i<testCase;i++){
			number[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(number);

		for (int i=0;i<testCase;i++){
			sb.append(number[i]).append('\n');
		}
		System.out.println(sb);
	}
}
