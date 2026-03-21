import java.util.*;

public class prosix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }

        double avg = sum / n;
        double threshold = 2 * avg;

        int count = 0;
        int[] idx = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > threshold) {
                idx[k] = i;
                k++;
                count++;
            }
        }

        System.out.println("Total Transactions: " + n);
        System.out.printf("Average Transaction: $%.2f\n", avg);
        System.out.println("Suspicious Transactions: " + count);

        System.out.print("Fraud Alert Indices: [");
        for (int i = 0; i < k; i++) {
            System.out.print(idx[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();
    }
}