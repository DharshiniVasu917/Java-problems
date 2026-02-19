import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cl=sc.nextInt();
        int pa=sc.nextInt();
        int cb=sc.nextInt();
        int des=((cl<=pa)&&(cb==0)?1:0);
        System.out.println((des==1)?"Approved":"Declined");
        sc.close();
    }
    
}
