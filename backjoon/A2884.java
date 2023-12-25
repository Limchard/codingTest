import java.util.Scanner;

public class A2884 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int h,m;
        h=sc.nextInt();
        m=sc.nextInt();

        m=m-45;
        if(m>59){
            m=m-60;
        } else if (m<0) {
            h=h-1;
            m=m+60;
        }

        if(h>24){
            h=h-24;
        } else if (h<0) {
            h=h+24;
        }

        System.out.println(h+" "+m);
    }
}
