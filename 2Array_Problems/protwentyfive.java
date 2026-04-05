import java.util.*;

class protwentyfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        double total = 0;
        int max = score[0], min = score[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < n; i++) {
            total += score[i];
            if (score[i] > max) {
                max = score[i];
                maxIndex = i;
            }
            if (score[i] < min) {
                min = score[i];
                minIndex = i;
            }
        }

        double avg = total / n;
        double threshold = avg * 2.0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (score[i] > threshold) {
                list.add(i + 1);
            }
        }

        System.out.println("Security Events Analyzed: " + n);
        System.out.printf("Average Risk Score: %.2f\n", avg);
        System.out.printf("Highest Risk Event: %d (Event %d)\n", max, maxIndex + 1);
        System.out.printf("Lowest Risk Event: %d (Event %d)\n", min, minIndex + 1);
        System.out.println("Critical Threats (>200% avg): " + list.size());
        System.out.printf("Threat Threshold: %.2f\n", threshold);
        System.out.println("Alert Events: " + list);
    }
}
