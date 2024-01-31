import java.io.*;
import java.util.StringTokenizer;

public class A2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int number=Integer.parseInt(br.readLine()); // 테스트 케이스 시행 횟수
        int stairsNumber [] = new int[number];
        int arrayNumber []=new int[number];

        for (int i=0;i<number;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            stairsNumber[i]=Integer.parseInt(st.nextToken());
            arrayNumber[i]=i;
        }

        int result=0;
        int count=0;
        for (int i=0;i<number-2;i=i+2){

        }

        bw.write(result);

        br.close();
        bw.flush();
        bw.close();



    }
}
