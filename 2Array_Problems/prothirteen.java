import java.util.*;

public class prothirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        int max = arr[0];
        int onTime = 0;
        int comp = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] <= 15) {
                onTime++;
            }

            if (arr[i] > 180) {
                comp++;
            }
        }

        double avg = sum / n;
        double percent = (onTime * 100.0) / n;

        System.out.println("Total Flights: " + n);
        System.out.printf("Average Delay: %.2f minutes\n", avg);
        System.out.println("Maximum Delay: " + max + " minutes");
        System.out.println("On-Time Flights: " + onTime);
        System.out.println("Compensation Required: " + comp);
        System.out.printf("On-Time Performance: %.2f%%\n", percent);
    }
}
