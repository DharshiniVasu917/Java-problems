import java.util.*;

public class proten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int min = a[0];
        int max = a[0];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }

            if (a[i] > max) {
                max = a[i];
            }

            sum = sum + a[i];

            if (a[i] > 200) {
                count++;
            }
        }

        double avg = (double) sum / n;
        double score = ((double)(n - count) / n) * 100;

        System.out.println("Total Servers: " + n);
        System.out.println("Fastest Response: " + min + "ms");
        System.out.println("Slowest Response: " + max + "ms");
        System.out.printf("Average Response: %.2fms\n", avg);
        System.out.println("Slow Servers (>200ms): " + count);
        System.out.printf("Performance Score: %.2f%%\n", score);
    }
}