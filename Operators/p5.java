import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        int credit=sc.nextInt();
        int total=((salary>25000) && (credit>700) ? 1 : 0);
        System.out.println((total==1)?"Approved":"Rejected");
        sc.close();
    }
    
}
