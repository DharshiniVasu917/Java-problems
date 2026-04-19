public class Main {
    static int sumDigits(int n) {
        int sum = 0;

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumDigits(n));
    }
}
