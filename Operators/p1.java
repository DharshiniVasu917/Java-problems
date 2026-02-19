import java.util.Scanner;
public class p1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int theory=sc.nextInt();
        int practical=sc.nextInt();
        int result=((theory<50)&&(practical<50)&&(((theory+practical)/2)>=60)?1:0);

        System.out.println((result==1)?"pass":"fail");
        sc.close();
    }
}