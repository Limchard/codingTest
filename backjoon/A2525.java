import java.util.Scanner;

public class A2525 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h,m,c;

        h=sc.nextInt();
        m=sc.nextInt();
        c=sc.nextInt();

        h+=c/60;
        m+=c%60;

        if(m>=60){
            h+=1;
            m-=60;
        }
        if(h>=24){
            h-=24;
        }
        System.out.println(h+" "+m);

    }
}
