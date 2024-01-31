import java.util.Scanner;

public class A2745_sg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N;
        int B;
        int n = 0;
        int answer = 0;

        N = sc.next(); // ZZZZZ
        B = sc.nextInt(); // 36

        for (int i=0; i<N.length(); i++) {
            char a = N.charAt(i); // String 하나 뽑기
            if (a >= '0' && a <= '9') {

                n = n*B + (a-'0'); // n 에서 B 를 곱한다. == 여기서는 0이고, a-'0'?

            } else {

                n = n*B + (a-'A'+10);
            }
        }
        answer = n;

        System.out.println(answer);
    }

}
