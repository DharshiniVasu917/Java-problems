import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int ba=sc.nextInt();
        int limit=sc.nextInt();
        int approval=(((w<=ba)&&(w<=limit))?1:0);
        System.out.println((approval==1)?"Approved":"Declined");
        sc.close();
    }
    
}
