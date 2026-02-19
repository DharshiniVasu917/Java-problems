import java.util.Scanner;
public class jbasic25 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int rusage=sc.nextInt();
        int rate=sc.nextInt();
        int cusage=sc.nextInt();
        int crate=sc.nextInt();
        int connection=sc.nextInt();
        int penalty=sc.nextInt();
        int maintenance=sc.nextInt();
        int treatment=sc.nextInt();
        int revenue;
        revenue=(rusage*rate)+(cusage*crate)+connection+penalty-maintenance-treatment;
        System.out.println(revenue);
        sc.close();
    }
    
}
