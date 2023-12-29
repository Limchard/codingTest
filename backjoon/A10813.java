import java.util.Scanner;

public class A10813 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n,m;

        n=sc.nextInt();
        m=sc.nextInt();

        int [] arr=new int[n];

        // 초기 바구니 세팅
        for (int i=0;i<n;i++){
            arr[i]=i+1;
        }


        int a,b,temp;

        for (int i=1;i<=m;i++){
            temp=0;
            a=sc.nextInt();
            b=sc.nextInt();

            temp=arr[a-1];
            arr[a-1]=arr[b-1];
            arr[b-1]=temp;
        }

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
