import java.util.Scanner;

public class A11022 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a+b;
            int d=i+1;
            System.out.println("Case #"+d+": "+a+" + "+b+" = "+c);

        }

    }

}
