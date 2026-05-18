public class Main {

    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void displayPrime(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        displayPrime(1, 50);

    }
}
