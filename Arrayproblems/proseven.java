import java.util.*;

public class proseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxDefects = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        int[] idx = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > maxDefects) {
                idx[k] = i + 1;
                k++;
                count++;
            }
        }

        double compliance = ((double)(n - count) / n) * 100;

        System.out.println("Production Lines: " + n);
        System.out.println("Acceptable Threshold: " + maxDefects);
        System.out.println("Lines Exceeding Threshold: " + count);

        System.out.print("Critical Lines: [");
        for (int i = 0; i < k; i++) {
            System.out.print(idx[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.printf("Compliance Rate: %.2f%%\n", compliance);
    }
}
