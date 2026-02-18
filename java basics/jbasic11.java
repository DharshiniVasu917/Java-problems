
import java.util.Scanner;
class jbasic11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int rateperkm=sc.nextInt();
        int maintenance=sc.nextInt();
        int driver=sc.nextInt();
        int subsidy=sc.nextInt();
        int finalbill;
        finalbill=(distance*rateperkm)+maintenance+driver-subsidy;
        System.out.println(finalbill);
        sc.close();
     
    }
}