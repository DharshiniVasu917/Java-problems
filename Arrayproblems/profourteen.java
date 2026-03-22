import java.util.*;

public class profourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        double sum = 0;
        double max = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        double avg = sum / n;
        double threshold = avg * 0.8;

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < threshold) {
                count++;
            }
        }

        System.out.println("Total Plots: " + n);
        System.out.printf("Total Harvest: %.2f tons\n", sum);
        System.out.printf("Average Yield: %.2f tons/acre\n", avg);
        System.out.printf("Highest Yield: %.2f tons/acre (Plot %d)\n", max, maxIndex + 1);
        System.out.println("Underperforming Plots: " + count);
        System.out.printf("Performance Threshold: %.2f tons/acre\n", threshold);
    }
}
