import java.util.*;

public class profive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] price = new double[n];

        for(int i = 0; i < n; i++) {
            price[i] = sc.nextDouble();
        }

        double min = price[0];
        double max = price[0];

        for(int i = 1; i < n; i++) {
            if(price[i] < min) {
                min = price[i];
            }
            if(price[i] > max) {
                max = price[i];
            }
        }
        double difference = max - min;
        double savings = (difference / max) * 100;
        System.out.println("Number of Sellers: " + n);
        System.out.printf("Lowest Price: $%.2f\n", min);
        System.out.printf("Highest Price: $%.2f\n", max);
        System.out.printf("Price Difference: $%.2f\n", difference);
        System.out.printf("Savings: %.2f%%\n", savings);
        sc.close();
    }
}