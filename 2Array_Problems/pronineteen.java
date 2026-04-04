import java.util.*;

public class pronineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] calories = new int[n];

        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int total = 0;
        int max = calories[0];
        int peakDay = 1;

        for (int i = 0; i < n; i++) {
            total += calories[i];

            if (calories[i] > max) {
                max = calories[i];
                peakDay = i + 1;
            }
        }

        double average = (double) total / n;

        int belowTarget = 0;

        for (int i = 0; i < n; i++) {
            if (calories[i] < target) {
                belowTarget++;
            }
        }

        double successRate = ((double)(n - belowTarget) / n) * 100;

        System.out.println("Days Tracked: " + n);
        System.out.println("Total Calories Burned: " + total);
        System.out.printf("Average Daily Burn: %.2f\n", average);
        System.out.println("Peak Burn Day: Day " + peakDay + " (" + max + " calories)");
        System.out.println("Days Below Target: " + belowTarget);
        System.out.printf("Goal Achievement: %.2f%%\n", successRate);
    }
}
