import java.util.Scanner;

public class A10810 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i,j,k;

        int [] arr=new int[n];

        for (int a=0;a<n;a++){
            arr[a]=0;
        }

        for (int a=0;a<m;a++){
            i=sc.nextInt();
            j=sc.nextInt();
            k=sc.nextInt();

            for (int b=i;b<=j;b++){
                arr[b-1]=k;
            }

        }

        for (int a=0;a<n;a++){
            System.out.print(arr[a]+" ");
        }








    }
}
