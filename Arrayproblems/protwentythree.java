import java.util.*;

class protwentythree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            output[i] = sc.nextInt();
        }

        int total = 0, max = output[0];
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            total += output[i];
            if (output[i] > max) {
                max = output[i];
                maxIndex = i;
            }
        }

        double avg = (double) total / n;
        double threshold = avg * 0.9;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (output[i] < threshold) {
                list.add(i + 1);
            }
        }

        System.out.println("Production Lines: " + n);
        System.out.println("Total Output: " + total + " units");
        System.out.printf("Average Output: %.2f units/hour\n", avg);
        System.out.printf("Top Producer: Line %d (%d units)\n", maxIndex + 1, max);
        System.out.println("Underperforming Lines: " + list.size());
        System.out.printf("Performance Threshold: %.2f units\n", threshold);
        System.out.println("Priority Lines: " + list);
    }
}