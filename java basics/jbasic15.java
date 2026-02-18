
import java.util.Scanner;
class jbasic15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int genpass=sc.nextInt();
        int genfare=sc.nextInt();
        int acpass=sc.nextInt();
        int acfare=sc.nextInt();
        int platform=sc.nextInt();
        int maintenance=sc.nextInt();
        int fuel=sc.nextInt();
        int finalbill;
        finalbill=(genpass*genfare)+(acpass*acfare)+platform-maintenance-fuel;
        System.out.println(finalbill);
        sc.close();
     
    }
}