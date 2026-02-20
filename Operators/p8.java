import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int id=sc.nextInt();
        int total=((age>18) && (id==1) ? 1 : 0);
        System.out.println((total==1)?"Allowed":"Denied");
        sc.close();
    }
    
}
