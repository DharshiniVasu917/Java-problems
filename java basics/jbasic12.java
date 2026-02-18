
import java.util.Scanner;
class jbasic12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ticket=sc.nextInt();
        int snack=sc.nextInt();
        int maintenance=sc.nextInt();
        int electricity=sc.nextInt();
        int finalbill;
        finalbill=ticket+snack-maintenance-electricity;
        System.out.println(finalbill);
        sc.close();
     
    }
}