import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int signal=sc.nextInt();
        int toggle=sc.nextInt();
        int total=(signal ^ toggle);
        System.out.println(total);
        sc.close();
    }
    
}
