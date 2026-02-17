
import java.util.Scanner;
class jbasic4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tutionfee=sc.nextInt();
        int scholarship=sc.nextInt();
        int examfee=sc.nextInt();
        int libfee=sc.nextInt();
        int dis = (tutionfee * scholarship) / 100;

        int tbill;
        tbill=tutionfee-dis+(examfee+libfee);
        System.out.println(tbill);
        sc.close();
     
    }
}