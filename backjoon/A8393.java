import java.util.Scanner;

public class A8393 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,a;
        n=sc.nextInt();
        a=0;
        for(int i=1;i<=n;i++){
            a+=i;
        }
        System.out.println(a);
    }
}
