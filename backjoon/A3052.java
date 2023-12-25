import java.util.Arrays;
import java.util.Scanner;

public class A3052 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int count=0;
        int [] arr = new int[10];
        int a=0;

        for (int i=0;i<10;i++){
            a=sc.nextInt();
            arr[i]=a%42;
        }
        Arrays.sort(arr);

        for (int i=1;i<10;i++){
            if (arr[i-1]==arr[i]){
                continue;
            } else {
                count++;
            }
        }
        System.out.println(count+1);
    }
}
