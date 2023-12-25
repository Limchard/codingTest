import java.util.Scanner;

public class A2738 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();

        int [][] m=new int[a][b];
        int [][] n=new int[a][b];



        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                m[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                n[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                m[i][j]=m[i][j]+n[i][j];
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }




    }
}
