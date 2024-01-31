import java.util.Arrays;
import java.util.Scanner;

public class A10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);

//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        System.out.println(arr[0]+" "+arr[n-1]);
    }
}
