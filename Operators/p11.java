import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int levels=sc.nextInt();
        int total=(base<<levels);
        System.out.println(total);
        sc.close();
    }
    
}
