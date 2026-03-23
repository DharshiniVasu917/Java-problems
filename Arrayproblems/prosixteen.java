import java.util.*;

public class prosixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] volume = new long[n];

        for (int i = 0; i < n; i++) {
            volume[i] = sc.nextLong();
        }

        long total = 0;
        long max = volume[0];
        int peakDay = 1;

        for (int i = 0; i < n; i++) {
            total += volume[i];

            if (volume[i] > max) {
                max = volume[i];
                peakDay = i + 1;
            }
        }

        long average = total / n;
        double threshold = average * 1.5;

        int count = 0;
        ArrayList<Integer> breakoutDays = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (volume[i] > threshold) {
                count++;
                breakoutDays.add(i + 1);
            }
        }

        System.out.println("Trading Days Analyzed: " + n);
        System.out.println("Total Volume: " + total);
        System.out.println("Average Daily Volume: " + average);
        System.out.println("Peak Volume Day: Day " + peakDay + " (" + max + ")");
        System.out.println("High Volume Days (>150% avg): " + count);
        System.out.println("Breakout Signal Days: " + breakoutDays);
    }
}