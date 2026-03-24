import java.util.*;

class protwentyfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] value = new double[n];

        for (int i = 0; i < n; i++) {
            value[i] = sc.nextDouble();
        }

        double total = 0, max = value[0], min = value[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < n; i++) {
            total += value[i];
            if (value[i] > max) {
                max = value[i];
                maxIndex = i;
            }
            if (value[i] < min) {
                min = value[i];
                minIndex = i;
            }
        }

        double avg = total / n;
        double bargain = avg * 0.7;
        double premium = avg * 1.5;

        int bargainCount = 0, premiumCount = 0;

        for (int i = 0; i < n; i++) {
            if (value[i] < bargain) {
                bargainCount++;
            }
            if (value[i] > premium) {
                premiumCount++;
            }
        }

        System.out.println("Total Properties: " + n);
        System.out.printf("Portfolio Value: $%.2f\n", total);
        System.out.printf("Average Property Value: $%.2f\n", avg);
        System.out.printf("Most Valuable: $%.2f (Property %d)\n", max, maxIndex + 1);
        System.out.printf("Least Valuable: $%.2f (Property %d)\n", min, minIndex + 1);
        System.out.println("Bargain Properties (<70% avg): " + bargainCount);
        System.out.println("Premium Properties (>150% avg): " + premiumCount);
    }
}