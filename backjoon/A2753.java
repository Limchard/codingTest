import java.util.Scanner;

public class A2753 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();

        if(a % 400 == 0 || (a%4==0 && a%100!=0)){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
