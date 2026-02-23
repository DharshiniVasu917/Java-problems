import java.util.Scanner;

public class p24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distanceMiles = sc.nextDouble();
        double orderValue = sc.nextDouble();
        sc.nextLine();
        String timeSlot = sc.nextLine();
        String weatherCondition = sc.nextLine();

        double baseFee = 3.0;
        double distanceSurcharge = distanceMiles * 1.0;
        double peakSurcharge = 0.0;
        double weatherSurcharge = 0.0;
        double discount = 0.0;

        if (timeSlot.equals("Lunch")) {
            peakSurcharge = 2.50;
        } else if (timeSlot.equals("Dinner")) {
            peakSurcharge = 2.00;
        } else if (timeSlot.equals("Late-Night")) {
            peakSurcharge = 1.50;
        }

        if (weatherCondition.equals("Rain")) {
            weatherSurcharge = 2.0;
        } else if (weatherCondition.equals("Snow")) {
            weatherSurcharge = 3.0;
        } else if (weatherCondition.equals("Storm")) {
            weatherSurcharge = 5.0;
        }

        if (orderValue >= 75.0) {
            discount = 5.0;
        } else if (orderValue >= 50.0) {
            discount = 3.0;
        } else if (orderValue >= 30.0) {
            discount = 1.0;
        }

        double finalFee = baseFee + distanceSurcharge + peakSurcharge + weatherSurcharge - discount;
        if (finalFee < 2.99) {
            finalFee = 2.99;
        }

        int deliveryTime = (int) (distanceMiles * 8);
        if (timeSlot.equals("Lunch") || timeSlot.equals("Dinner")) {
            deliveryTime += 10;
        }

        if (weatherCondition.equals("Rain")) {
            deliveryTime += 5;
        } else if (weatherCondition.equals("Snow")) {
            deliveryTime += 10;
        } else if (weatherCondition.equals("Storm")) {
            deliveryTime += 15;
        }

        String priority = "Standard";
        if (orderValue > 60.0) {
            priority = "Express";
        } else if (timeSlot.equals("Dinner") || timeSlot.equals("Lunch")) {
            priority = "High";
        }

        System.out.println("Delivery Distance: " + distanceMiles + " miles");
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Weather Condition: " + weatherCondition);
        System.out.println("Base Delivery Fee: $" + baseFee);
        System.out.println("Distance Surcharge: $" + distanceSurcharge);
        System.out.println("Peak Time Surcharge: $" + peakSurcharge);
        System.out.println("Weather Surcharge: $" + weatherSurcharge);
        System.out.println("Order Value Discount: $" + discount);
        System.out.println("Final Delivery Fee: $" + finalFee);
        System.out.println("Estimated Delivery Time: " + deliveryTime + " minutes");
        System.out.println("Service Priority: " + priority);

        sc.close();
    }
}
