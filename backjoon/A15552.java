import java.io.*;
import java.util.StringTokenizer;

public class A15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(br.readLine());

        // br.readLine() 으로 입력 받아야한다. 그리고 무조건 문자열로 받아진다.

        for(int i=0;i<n;i++){
            StringTokenizer str=new StringTokenizer(br.readLine()); // 새로운 값 입력
            int a=Integer.parseInt(str.nextToken()); // 입력값 중 첫번째 토큰 저장
            int b=Integer.parseInt(str.nextToken()); // 입력값 중 두번째 토큰 저장
            bw.write(a+b+"\n"); // 버퍼 사용 (즉 쇼핑카트에 담는 것)
        }
        bw.flush(); // 화면에 출력 (출력하고 싶을때 한번만 출력할 것.)
        bw.close(); // BufferedWriter 종료
        br.close(); //BufferedReader 종료
    }

}
