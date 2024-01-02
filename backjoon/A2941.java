import java.util.Scanner;
import java.util.StringTokenizer;

public class A2941 {
    public static void main(String[] args) {
        // c= c- dz= d- lj nj s= z=

        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        int count=0;

        String [] Croatia={"c=","c-","dz=","d-","lj","nj","s=","z="};

        for (int i=0;i<Croatia.length;i++){
            str=str.replace(Croatia[i],"a");
        }

        System.out.println(str.length());
    }
}
