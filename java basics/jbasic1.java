
import java.util.Scanner;
class jbasic1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int basic=sc.nextInt();
        int hra=sc.nextInt();
        int bonous=sc.nextInt();
        int tax=sc.nextInt();
        int pf=sc.nextInt();
        int ths;
        ths=(basic+hra+bonous)-(tax+pf);
        System.out.println(+ ths);
        sc.close();
     
    }
}