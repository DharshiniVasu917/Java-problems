import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookingClass = sc.nextLine();
        int daysUntilDeparture = sc.nextInt();
        double seatAvailability = sc.nextDouble();
        sc.nextLine();
        String routeType = sc.nextLine();

        double basePrice = 0.0;
        double demandMultiplier = 1.0;
        String pricingCategory = "Moderate";

        if (bookingClass.equalsIgnoreCase("Economy")) {
            if (routeType.equalsIgnoreCase("Domestic")) basePrice = 200.0;
            else if (routeType.equalsIgnoreCase("International-Short")) basePrice = 500.0;
            else if (routeType.equalsIgnoreCase("International-Long")) basePrice = 800.0;
        } else if (bookingClass.equalsIgnoreCase("Business")) {
            if (routeType.equalsIgnoreCase("Domestic")) basePrice = 600.0;
            else if (routeType.equalsIgnoreCase("International-Short")) basePrice = 1500.0;
            else if (routeType.equalsIgnoreCase("International-Long")) basePrice = 2500.0;
        } else if (bookingClass.equalsIgnoreCase("First")) {
            if (routeType.equalsIgnoreCase("Domestic")) basePrice = 1000.0;
            else if (routeType.equalsIgnoreCase("International-Short")) basePrice = 3000.0;
            else if (routeType.equalsIgnoreCase("International-Long")) basePrice = 5000.0;
        }

        if (seatAvailability < 30 && daysUntilDeparture < 14) {
            demandMultiplier = 1.8;
            pricingCategory = "High Demand";
        } else if (seatAvailability < 50 && daysUntilDeparture < 30) {
            demandMultiplier = 1.5;
            pricingCategory = "High Demand";
        } else if (seatAvailability >= 60 && daysUntilDeparture > 60) {
            demandMultiplier = 0.8;
            pricingCategory = "Low Demand";
        } else if (seatAvailability < 60 || (daysUntilDeparture >= 30 && daysUntilDeparture <= 60)) {
            demandMultiplier = 1.0;
            pricingCategory = "Moderate";
        }

        double finalPrice = basePrice * demandMultiplier;

        System.out.println("Booking Class: " + bookingClass);
        System.out.println("Days Until Departure: " + daysUntilDeparture);
        System.out.println("Seat Availability: " + seatAvailability + "%");
        System.out.println("Route Type: " + routeType);
        System.out.format("Base Price: $%.1f\n", basePrice);
        System.out.println("Demand Multiplier: " + demandMultiplier + "x");
        System.out.format("Final Ticket Price: $%.1f\n", finalPrice);
        System.out.println("Pricing Category: " + pricingCategory);

        sc.close();
    }
}

