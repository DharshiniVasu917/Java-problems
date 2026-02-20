import java.util.Scanner;
public class p9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int un=sc.nextInt();
        int pa=sc.nextInt();
        int acc=sc.nextInt();
        int des=((un==1)&&(pa==1)&&(acc==0)?1:0);
        System.out.println((des==1)?"Success":"Failed");
        sc.close();
    }
    
}

