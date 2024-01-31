import java.util.Scanner;

public class A24267 {
    public static void main(String[] args) {

//        MenOfPassion(A[], n) {
//            sum <- 0;
//            for i <- 1 to n - 2
//            for j <- i + 1 to n - 1
//            for k <- j + 1 to n
//            sum <- sum + A[i] × A[j] × A[k]; # 코드1
//            return sum;
//        }

        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();

        System.out.println((n*(n-1)*(n-2))/6);
        System.out.println(3);



    }
}
