
import java.util.Scanner;
class jbasic14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        int sessions=sc.nextInt();
        int pay=sc.nextInt();
        int bonous=sc.nextInt();
        int maintenance=sc.nextInt();
        int finalbill;
        finalbill=salary+(sessions*pay)+bonous-maintenance;
        System.out.println(finalbill);
        sc.close();
     
    }
}