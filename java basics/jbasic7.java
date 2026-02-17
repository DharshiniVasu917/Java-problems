
import java.util.Scanner;
class jbasic7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int wageperday=sc.nextInt();
        int overtime=sc.nextInt();
        int maintanance=sc.nextInt();
        int base = days*wageperday;
        int bonous=base+overtime;
        int tpp;
        tpp=bonous-maintanance;
        System.out.println(tpp);
        sc.close();
     
    }
}