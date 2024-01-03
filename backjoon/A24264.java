import java.util.Scanner;

public class A24264 {
    public static void main(String[] args) {
//        MenOfPassion(A[], n) {
//            sum <- 0;
//            for i <- 1 to n
//            for j <- 1 to n
//            sum <- sum + A[i] × A[j]; # 코드1
//            return sum;
//        }

//        1. # 코드 1 은 n의 제곱번 수행했다. i를 n번 실행하고 i가 증가할 때마다 각각 n번 실행했다.
//        2. 최고 차수는 2이다. n의 제곱이니까

        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        long n=sc.nextInt();
        System.out.println((int)Math.pow(n,2));
//        System.out.println(n*n);
        System.out.println(2);




    }
}
