public class Main {
    static boolean canWithdraw(int balance, int amount) {
        return balance >= amount;
    }

    public static void main(String[] args) {
        int balance = 5000;
        int amount = 2000;

        if(canWithdraw(balance, amount))
            System.out.println("Withdrawal Successful");
        else
            System.out.println("Insufficient Balance");
    }
}
