
import java.util.Scanner;
class jbasic20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ads=sc.nextInt();
        int sponsor=sc.nextInt();
        int affliate=sc.nextInt();
        int tax=sc.nextInt();
        int production=sc.nextInt();
        int finalbill;
        finalbill=ads+sponsor+affliate-tax-production;
        System.out.println(finalbill);
        sc.close();
     
    }
}