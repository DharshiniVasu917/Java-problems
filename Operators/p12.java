import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int filesize=sc.nextInt();
        int compression=sc.nextInt();
        int total=(filesize>>compression);
        System.out.println(total);
        sc.close();
    }
    
}
