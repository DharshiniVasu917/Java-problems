import java.util.*;
public class BankTransactionAnalyser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        String category="";
        double depositamt=0;
        double debitedamt=0;
        double netbalance=0;
        double withdrawalamt=0;
        double transferamt=0;
        double paymentamt=0;

        for(int i=1;i<=n;i++){
        String transactiontype=sc.next();
        double amount=sc.nextDouble();
        
        if(transactiontype.equals("Deposit")){
            category="Credit";
            depositamt+=amount;
        }
        else if(transactiontype.equals("Withdrawal")){
                category="Debit";
                withdrawalamt+=amount;
                debitedamt+=amount;
            }
            else if(transactiontype.equals("Transfer")){
                category="Debit";
                transferamt+=amount;
                debitedamt+=amount;
            }
            else if(transactiontype.equals("Payment")){
                category="Debit";
                paymentamt+=amount;
                debitedamt+=amount;
            }
            System.out.println("Transaction "+i+":"+transactiontype);
            System.out.println("Amount: $"+amount);
            System.out.println("Category: "+category);
            System.out.println();
            netbalance=depositamt-debitedamt;
        }
        System.out.println("Total Transactions: "+n);
        System.out.println("Total Deposits: $"+depositamt);
        System.out.println("Total Withdrawals: $"+withdrawalamt);
        System.out.println("Total Transfers: $"+transferamt);
        System.out.println("Total Payments: $"+paymentamt);
        System.out.println("Net Balance Change: $"+netbalance);
        sc.close();

    }
    
}
 