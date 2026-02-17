
import java.util.Scanner;
class jbasic3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sales=sc.nextInt();
        int discount=sc.nextInt();
        int gst=sc.nextInt();
        int dis=(sales*discount)/100;
        int amt=((sales-dis)*gst)/100;
        int tbill;
        tbill=sales-dis+amt;
        System.out.println(tbill);
        sc.close();
     
    }
}