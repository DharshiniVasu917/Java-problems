import java.util.Scanner;
public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int wh=sc.nextInt();
        int at=sc.nextInt();
        int total=((wh>40) && (at>90)?1:0);
        System.out.println((total==1)?"Eligible":"Not Eligible");
        sc.close();
        
    }
    
}
