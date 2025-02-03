import java.util.Scanner;

public class A2605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            if (r == 0) {
                continue;
            }
            for (int j = 1; j <= r; j++) {
                int temp = array[i - j];
                array[i - j] = array[i];
                array[i] = temp;
            }
        }

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}

