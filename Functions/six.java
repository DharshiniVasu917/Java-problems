public class Main {

    static boolean armstrong(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {

            int rem = n % 10;
            sum = sum + (rem * rem * rem);

            n = n / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        int num = 153;

        if (armstrong(num)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

    }
}
