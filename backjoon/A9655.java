import java.io.*;

public class A9655 {
    public static void main(String[] args) throws IOException {

//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int stoneNumber=Integer.parseInt(br.readLine());
//        int tryMember=0; // 짝수면 이면 상근이, 홀수면 창영이
//
//        for (int i=0;i<stoneNumber;++i){
//            int ran=(int)(Math.random()*10);
//            if (ran%2==0){
//                i=i+2;
//                tryMember++;
//            } else if (ran%2!=0) {
//                tryMember++;
//                continue;
//            }
//        }
//        if (tryMember%2!=0){
//            System.out.println("SK");
//        } else if (tryMember%2==0) {
//            System.out.println("CY");
//        }

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int stoneCount=Integer.parseInt(br.readLine());

        if (stoneCount%2==0){
            bw.write("CY");
        } else {
            bw.write("SK");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}
