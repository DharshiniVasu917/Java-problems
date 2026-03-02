import java.util.*;

public class Montlysalescommisioncalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        double totalSales = 0;
        double totalCommissions = 0;
        String topPerformer = "";
        double maxsales = -1;

        for (int i = 0; i < n; i++) {
            String repname = sc.next();
            double salesamount = sc.nextDouble();
            
            int commision = 0;
            if (salesamount <= 40000) {
                commision = 5;
            } else if (salesamount <= 80000) {
                commision = 8;
            } else if (salesamount <= 100000) {
                commision = 10;
            } else if (salesamount <= 150000) {
                commision = 12;
            } else {
                commision = 15;
            }

            double commisiontotal = salesamount * (commision / 100.0);
            
            double bonous = 0;
            if (salesamount >= 150000) {
                bonous = 3000.0;
            } else if (salesamount >= 100000) {
                bonous = 2000.0;
            }

            double totalpayout = commisiontotal + bonous;

            System.out.println("Sales Rep: " + repname);
            System.out.println("Sales Amount: $" + salesamount);
            System.out.println("Commission Rate: " + commision + "%");
            System.out.println("Commission Earned: $" + commisiontotal);
            System.out.println("Bonus: $" + bonous);
            System.out.println("Total Payout: $" + totalpayout);
            System.out.println();

            totalSales += salesamount;
            totalCommissions += totalpayout;

            if (salesamount > maxsales) {
                maxsales = salesamount;
                topPerformer = repname;
            }
        }

        System.out.println("Total Sales Reps: " + n);
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Total Commissions: $" + totalCommissions);
        System.out.print("Top Performer: " + topPerformer);
        
        sc.close();
    }
}


