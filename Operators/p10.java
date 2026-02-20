import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int alert=sc.nextInt();
        int fluctuation=sc.nextInt();
        int total=((alert>500) || (fluctuation==1) ? 1 : 0);
        System.out.println((total==1)?"Alert":"Normal");
        sc.close();
    }
    
}
