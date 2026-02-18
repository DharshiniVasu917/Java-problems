import java.util.Scanner;
class jbasic16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rooms=sc.nextInt();
        int price=sc.nextInt();
        int service=sc.nextInt();
        int commision=sc.nextInt();
        int finalbill;
        finalbill=(rooms*price)-service-commision;
        System.out.println(finalbill);
        sc.close();
     
    }
}