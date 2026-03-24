import java.util.*;

class protwentyone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] mpg = new double[n];

        for (int i = 0; i < n; i++) {
            mpg[i] = sc.nextDouble();
        }

        double sum = 0, max = mpg[0], min = mpg[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < n; i++) {
            sum += mpg[i];
            if (mpg[i] > max) {
                max = mpg[i];
                maxIndex = i;
            }
            if (mpg[i] < min) {
                min = mpg[i];
                minIndex = i;
            }
        }

        double avg = sum / n;
        double threshold = avg * 0.8;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (mpg[i] < threshold) {
                list.add(i + 1);
            }
        }

        System.out.println("Fleet Size: " + n);
        System.out.printf("Average Fuel Efficiency: %.2f MPG\n", avg);
        System.out.printf("Most Efficient: %.2f MPG (Vehicle %d)\n", max, maxIndex + 1);
        System.out.printf("Least Efficient: %.2f MPG (Vehicle %d)\n", min, minIndex + 1);
        System.out.println("Underperforming Vehicles: " + list.size());
        System.out.printf("Efficiency Threshold: %.2f MPG\n", threshold);
        System.out.println("Maintenance Priority: " + list);
    }
}