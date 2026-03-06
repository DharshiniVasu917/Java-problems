import java.util.*;

public class ATMWithdrawalValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        System.out.println("Balance: "+balance);
        int withdrawl;
        do {
            withdrawl=sc.nextInt();
            System.out.println("Enter withdrawal amount: "+withdrawl);

            if (withdrawl>balance) {
                System.out.println("Insufficient funds! Try again");
            } else if (withdrawl<=100) {
                System.out.println("Invalid amount! Try again");
            } else {
                balance=balance-withdrawl;
                System.out.println("Withdrawal successful! Remaining balance: "+balance);
                break;
            }

        } while (true);

        sc.close();
    }
}

