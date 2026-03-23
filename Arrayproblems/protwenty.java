import java.util.*;

public class protwenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] completion = new int[n];

        for (int i = 0; i < n; i++) {
            completion[i] = sc.nextInt();
        }

        int total = 0;
        int max = completion[0];
        int min = completion[0];
        int maxIndex = 1;
        int minIndex = 1;

        for (int i = 0; i < n; i++) {
            total += completion[i];

            if (completion[i] > max) {
                max = completion[i];
                maxIndex = i + 1;
            }

            if (completion[i] < min) {
                min = completion[i];
                minIndex = i + 1;
            }
        }

        double average = (double) total / n;

        int atRisk = 0;

        for (int i = 0; i < n; i++) {
            if (completion[i] < 60) {
                atRisk++;
            }
        }

        double successRate = ((double)(n - atRisk) / n) * 100;

        System.out.println("Total Students: " + n);
        System.out.printf("Average Completion: %.2f%%\n", average);
        System.out.println("Highest Completion: " + max + "% (Student " + maxIndex + ")");
        System.out.println("Lowest Completion: " + min + "% (Student " + minIndex + ")");
        System.out.println("At-Risk Students (<60%): " + atRisk);
        System.out.printf("Success Rate: %.2f%%\n", successRate);
    }
}