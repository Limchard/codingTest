import java.util.Scanner;

public class A2444 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=(n-i);j>0;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=(2*i-2);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n-1; i >= 0 ; i--) {
            for(int j = 0; j < n-i; j++)
                System.out.print(" ");
            for(int j = 0; j < i*2-1; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
