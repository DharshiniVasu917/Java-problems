
import java.util.Scanner;
class jbasic9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int room=sc.nextInt();
        int days=sc.nextInt();
        int mcost=sc.nextInt();
        int lab=sc.nextInt();
        int insurance=sc.nextInt();
        int finalbill;
        finalbill=(room*days)+mcost+lab-insurance;
        System.out.println(finalbill);
        sc.close();
     
    }
}