import java.util.Scanner;

public class A1085 {
    public static void main(String[] args) {

        int x,y,w,h;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        w=sc.nextInt();
        h=sc.nextInt();

        int a=w-x;
        int b=x-0;
        int c=h-y;
        int d=y-0;

        int m1=Math.min(a,b);
        int m2=Math.min(c,d);
        int m3=Math.min(m1,m2);

        System.out.println(m3);

    }
}
