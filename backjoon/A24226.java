import java.util.Scanner;

public class A24226 {
    public static void main(String[] args) {
//        MenOfPassion(A[], n) {
//            sum <- 0;
//            for i <- 1 to n
//            for j <- 1 to n
//            for k <- 1 to n
//            sum <- sum + A[i] × A[j] × A[k]; # 코드1
//            return sum;
//        }

        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();

//        System.out.println((long) Math.pow(n,3)); // 이게 왜 안되는거지?
        System.out.println(n*n*n);
        System.out.println(3);

    }
}
