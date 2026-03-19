import java.util.*;

public class profour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] temp = new double[n];

        for (int i = 0; i < n; i++) {
            temp[i] = sc.nextDouble();
        }

        double max = temp[0];
        double min = temp[0];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            if (temp[i] > max) {
                max = temp[i];
            }
            if (temp[i] < min) {
                min = temp[i];
            }
            sum += temp[i];
        }

        double range = max - min;
        double avg = sum / n;

        System.out.println("Number of Readings: " + n);
        System.out.printf("Maximum Temperature: %.2f°C\n", max);
        System.out.printf("Minimum Temperature: %.2f°C\n", min);
        System.out.printf("Temperature Range: %.2f°C\n", range);
        System.out.printf("Average Temperature: %.2f°C\n", avg);
        sc.close();
    }
}