import java.util.Scanner;

public class A1978 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();
        int count=0;

        for(int i=0;i<n;i++){
            m=sc.nextInt();
            if(m<1){
                continue;
            } else if (m==2) {
                count++;
            } else if (m>2) {
                for(int j=2;j<m;j++){
                    if(m%j==0){
                        break;
                    } else if (m==(j+1)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
