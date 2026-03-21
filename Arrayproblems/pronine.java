import java.util.*;

public class pronine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }

        double max = a[0];
        double min = a[0];
        int maxIndex = 0;
        int minIndex = 0;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }

            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }

            sum = sum + a[i];
        }

        double avg = sum / n;

        System.out.println("Total Stores: " + n);
        System.out.printf("Highest Sales: $%.2f (Store %d)\n", max, maxIndex + 1);
        System.out.printf("Lowest Sales: $%.2f (Store %d)\n", min, minIndex + 1);
        System.out.printf("Total Sales: $%.2f\n", sum);
        System.out.printf("Average Sales: $%.2f\n", avg);
    }
}