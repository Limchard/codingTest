import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A24265 {
//    public static void main(String[] args) throws IOException {
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
//        int n=Integer.parseInt(br.readLine());
//
////        int n=sc.nextInt();
//        int [] arr=new int[n+1];
//
//        int sum=0;
//        int count=0;
//
//        StringTokenizer st;
//
//        for (int i=1;i<n;i++){
//            for (int j=i+1;j<=n;j++){
//                sum+=sum+arr[i]*arr[j];
//                count++;
//            }
//        }
//        bw.write(count);
////        System.out.println(count);
//
//        String countStr=String.valueOf(count);
//        bw.write(countStr.length());
//
////        System.out.println(countStr.length());
//        br.close();
//        bw.flush();
//        bw.close();

//        String [] arrCount=new String[5000000];
//
//        for (int i=0;i<5000000;i++){
//            arrCount[i]= countStr;
//        }
//        System.out.println(arrCount.length);

//
//        MenOfPassion(A[], n) {
//            sum <- 0;
//            for i <- 1 to n - 1
//            for j <- i + 1 to n
//            sum <- sum + A[i] × A[j]; # 코드1
//            return sum;
//        }


        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt(); // 이건 왜 또 long 인건데..
//        int n=sc.nextInt();

        System.out.println((n*(n-1))/2);
        System.out.println(2);


    }
}
