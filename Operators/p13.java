import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int connection=sc.nextInt();
        int appliance=sc.nextInt();
        int total=((connection & appliance)==appliance?1:0);
        System.out.println(total==1?"Active":"Inactive");
        sc.close();
    }
    
}
