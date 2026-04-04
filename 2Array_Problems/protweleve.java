import java.util.*;

public class protweleve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        double limit = sc.nextDouble();

        double total = 0;
        double max = -1;
        int peakIndex = 0;

        for (int i = 0; i < n; i++) {
            total += arr[i];

            if (arr[i] > max) {
                max = arr[i];
                peakIndex = i;
            }
        }

        double avg = total / n;

        System.out.println("Hours Monitored: " + n);
        System.out.printf("Total Daily Consumption: %.2f kWh\n", total);
        System.out.printf("Peak Hour: Hour %d (%.2f kWh)\n", peakIndex + 1, max);
        System.out.printf("Average Hourly: %.2f kWh\n", avg);
        System.out.printf("Daily Limit: %.2f kWh\n", limit);

        if (total <= limit) {
            System.out.println("Status: Within Limit");
        } else {
            System.out.printf("Status: Exceeded by %.2f kWh\n", total - limit);
        }
    }
}