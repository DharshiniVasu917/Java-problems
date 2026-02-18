
import java.util.Scanner;
class jbasic13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yeild=sc.nextInt();
        int acers=sc.nextInt();
        int extrafeilds=sc.nextInt();
        int damaged=sc.nextInt();
        int finalbill;
        finalbill=(yeild*acers)+extrafeilds-damaged;
        System.out.println(finalbill);
        sc.close();
     
    }
}