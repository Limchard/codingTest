import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class A10828 {
    public static void main(String[] args) throws IOException {

        // 14시 41분 시작

        Stack<Integer> stack=new Stack<>();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int number=Integer.parseInt(br.readLine()); // 테스트 케이스 시행 횟수

        for (int i=0;i<number;i++){
//            String commend= br.readLine();
            StringTokenizer st=new StringTokenizer(br.readLine());
            String commend=st.nextToken();
            if (commend.equals("push")){
                int pushNumber=Integer.parseInt(st.nextToken());
                stack.push(pushNumber);
            } else if (commend.equals("top")) {
//                if (stack.size()==0){
                if (stack.isEmpty()){
                    System.out.println(-1);
//                    bw.write("-1");
//                    bw.newLine();
                } else {
                    System.out.println(stack.peek());
//                    bw.write(stack.peek());
//                    bw.newLine();
                }
            } else if (commend.equals("size")){
                System.out.println(stack.size());
//                bw.write(stack.size());
//                bw.newLine();
            } else if (commend.equals("empty")) {
                if (stack.empty()){
                    System.out.println(1);
//                    bw.write("1");
//                    bw.newLine();
                } else if (!stack.empty()) {
                    System.out.println(0);
//                    bw.write(0);
//                    bw.newLine();
                }
            } else if (commend.equals("pop")) {
//                if (stack.size()==0){
                if (stack.isEmpty()){
                    System.out.println(-1);
//                    bw.write(-1);
//                    bw.newLine();
                } else {
                    System.out.println(stack.pop());
//                    bw.write(stack.pop());
//                    bw.newLine();
                }
            }
        }
//        br.close();
//        bw.flush();
//        bw.close();
    }
}
