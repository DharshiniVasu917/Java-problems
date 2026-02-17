import java.util.Scanner;
class jbasic8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rods=sc.nextInt();
        int hours=sc.nextInt();
        int overtime=sc.nextInt();
        int rejected=sc.nextInt();
        int tpp;
        tpp=(rods*hours)+overtime-rejected;
        System.out.println(tpp);
        sc.close();
     
    }
}