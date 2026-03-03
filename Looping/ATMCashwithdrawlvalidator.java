import java.util.*;
public class ATMCashwithdrawlvalidator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double initialbalance=sc.nextDouble();
        int n=sc.nextInt();
        double currentbalance=initialbalance;
        int success=0;
        int failed=0;
        double totalwithdrawl=0;
        for(int i=0;i<n;i++){
            double withdrawlamount=sc.nextDouble();
            System.out.println("Transaction " + i + ": $" + withdrawlamount);
            if(withdrawlamount<=currentbalance){
                currentbalance-=withdrawlamount;
                totalwithdrawl+=withdrawlamount;
                success++;
                System.out.println("Status: Approved");
            }
            else {
                failed++;
                System.out.println("Status: Denied");
                System.out.println("Insufficient funds");

            }
            System.out.println("Remaining Balance: $" + currentbalance);
            System.out.println();
        }

        System.out.println("Total Transactions: " + n);
        System.out.println("Successful Withdrawals: " + success);
        System.out.println("Failed Withdrawals: " + failed);
        System.out.println("Final Balance: $" + currentbalance);
        System.out.println("Total Withdrawn: $" + totalwithdrawl);
        sc.close();
    }
    
}
