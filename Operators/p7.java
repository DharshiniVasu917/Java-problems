import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cartValue=sc.nextInt();
        int premiumMember=sc.nextInt();
        int total=((cartValue>999) || (premiumMember==1) ? 1 : 0);
        System.out.println((total==1)?"Free Shipping":"Charges Applied");
        sc.close();
    }
    
}