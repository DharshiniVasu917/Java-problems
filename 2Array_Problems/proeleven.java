import java.util.*;

public class proeleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] qty = new double[n];
        double[] price = new double[n];
        double[] value = new double[n];

        for (int i = 0; i < n; i++) {
            qty[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextDouble();
        }

        double total = 0;
        double max = -1;
        double min = Double.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            value[i] = qty[i] * price[i];
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

        System.out.println("Number of Assets: " + n);
        System.out.printf("Total Portfolio Value: $%.2f\n", total);
        System.out.printf("Most Valuable Asset: Asset %d ($%.2f)\n", maxIndex + 1, max);
        System.out.printf("Least Valuable Asset: Asset %d ($%.2f)\n", minIndex + 1, min);
    }
}
