import java.util.Scanner;

public class A10798 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String [][] arr=new String[5][15]; // 5x15 의 스트링 배열

        // 배열 만들기
        for (int i=0;i<5;i++){
            String str=sc.next();
            int count=str.length(); // 길이 체크
            for (int j=0;j<count;j++){
                arr[i][j]= Character.toString(str.charAt(j));
            }
        }

        // 출력하기
        for (int j=0;j<15;j++){
            for (int i=0;i<5;i++){
                if (arr[i][j]==null){ // `\0` 는 빈문자열을 뜻한다. // 빈문자열 처리를 못하는거네
                    continue;
                } else {
                    System.out.print(arr[i][j]);
                }
            }
        }

    }
}
