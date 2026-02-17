import java.util.Scanner;
public class jbasic5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int bill=sc.nextInt();
        int service=sc.nextInt();
        int gst=sc.nextInt();
        int people=sc.nextInt();
        float amount;
        amount=bill+(bill*service/100)+(bill*gst/100);
        float result=amount/people;
        System.out.println(result);
        sc.close();
    }
    
}
