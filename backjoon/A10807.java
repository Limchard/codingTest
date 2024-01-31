import java.util.Scanner;

public class A10807 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a,c;
        a=sc.nextInt();
        int [] arr=new int[a];
        int count=0;

        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        c=sc.nextInt();
        for(int j=0;j<arr.length;j++){
            if(arr[j]==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
