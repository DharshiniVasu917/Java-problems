import java.util.*;

public class proeighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] sales = new int[n];

        for (int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }

        int total = 0;
        int max = sales[0];
        int bestIndex = 1;

        for (int i = 0; i < n; i++) {
            total += sales[i];

            if (sales[i] > max) {
                max = sales[i];
                bestIndex = i + 1;
            }
        }

        double average = (double) total / n;
        double threshold = average * 0.5;

        int count = 0;
        ArrayList<Integer> slowProducts = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (sales[i] < threshold) {
                count++;
                slowProducts.add(i + 1);
            }
        }

        System.out.println("Total Products: " + n);
        System.out.println("Total Units Sold: " + total);
        System.out.printf("Average Monthly Sales: %.2f\n", average);
        System.out.println("Best Seller: Product " + bestIndex + " (" + max + " units)");
        System.out.println("Slow-Moving Products: " + count);
        System.out.printf("Turnover Threshold: %.2f units\n", threshold);
        System.out.println("Clearance Candidates: " + slowProducts);
    }
}