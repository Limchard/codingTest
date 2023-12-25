import java.util.Scanner;

public class A11720 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String str=sc.next();
        int total=0;

        for (int i=0;i<n;i++){
            total+=str.charAt(i)-'0'; // chatAt의 경우 아스키코드를 출력하기 때문에 뒤에 `-'0'` 또는 `-48`를 해줘야 한다
        }
        System.out.println(total);

    }
}
