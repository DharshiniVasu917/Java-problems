import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int percentage=sc.nextInt();
        int total=((income<2000000) && (percentage>=75) ? 1 : 0);
        System.out.println((total==1)?"Granted":"Not Granted");
        sc.close();
    }
    
}