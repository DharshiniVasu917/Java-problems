import java.util.*;

public class proeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }

            sum = sum + a[i];

            if (a[i] > 60) {
                count++;
            }
        }

        double avg = (double) sum / n;
        double service = ((double)(n - count) / n) * 100;

        System.out.println("Total Patients: " + n);
        System.out.println("Longest Wait Time: " + max + " minutes");
        System.out.printf("Average Wait Time: %.2f minutes\n", avg);
        System.out.println("Patients Waiting >60 min: " + count);
        System.out.printf("Service Level: %.2f%%\n", service);
    }
}