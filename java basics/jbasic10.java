import java.util.Scanner;
class jbasic10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int deliveries=sc.nextInt();
        int payout=sc.nextInt();
        int incentive=sc.nextInt();
        int fuelcost=sc.nextInt();
        int finalbill;
        finalbill=(deliveries*payout)+incentive-fuelcost;
        System.out.println(finalbill);
        sc.close();
     
    }
}