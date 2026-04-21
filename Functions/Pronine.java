public class Main {
    static int power(int x, int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }

    static int countDigits(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        int digits = countDigits(n);

        while(temp > 0) {
            int d = temp % 10;
            sum += power(d, digits);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        int n = 153;

        if(isArmstrong(n))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
