import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String roomCategory = sc.nextLine();
        String season = sc.nextLine();
        int nightsBooked = sc.nextInt();
        sc.nextLine();
        String loyaltyTier = sc.nextLine();

        double baseRate = 0;
        double seasonalMultiplier = 1.0;
        double extendedDiscount = 0;
        double loyaltyDiscount = 0;
        String upgrades = "None";

        if (roomCategory.equals("Standard")) {
            baseRate = 150.0;
        } else if (roomCategory.equals("Deluxe")) {
            baseRate = 300.0;
        } else if (roomCategory.equals("Suite")) {
            baseRate = 500.0;
        } else if (roomCategory.equals("Presidential")) {
            baseRate = 1000.0;
        }

        if (season.equals("Off-Peak")) {
            seasonalMultiplier = 0.7;
        } else if (season.equals("Regular")) {
            seasonalMultiplier = 1.0;
        } else if (season.equals("Peak")) {
            seasonalMultiplier = 1.5;
        } else if (season.equals("Holiday")) {
            seasonalMultiplier = 2.0;
        }

        if (nightsBooked >= 15) {
            extendedDiscount = 20;
        } else if (nightsBooked >= 8) {
            extendedDiscount = 10;
        } else if (nightsBooked >= 5) {
            extendedDiscount = 5;
        } else {
            extendedDiscount = 0;
        }

        if (loyaltyTier.equals("Member")) {
            loyaltyDiscount = 10;
            upgrades = "Free breakfast";
        } else if (loyaltyTier.equals("Gold")) {
            loyaltyDiscount = 15;
            upgrades = "Free breakfast and spa access";
        } else if (loyaltyTier.equals("Platinum")) {
            loyaltyDiscount = 20;
            if (roomCategory.equals("Presidential")) {
                upgrades = "Concierge service, airport transfer, and fine dining";
            } else {
                upgrades = "Free breakfast, spa access, and lounge entry";
            }
        }

        double seasonalRate = baseRate * seasonalMultiplier;
        double nightlyRate = seasonalRate * (1 - extendedDiscount / 100.0) * (1 - loyaltyDiscount / 100.0);
        double totalBookingCost = nightlyRate * nightsBooked;

        System.out.println("Room Category: " + roomCategory);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nightsBooked);
        System.out.println("Loyalty Tier: " + loyaltyTier);
        System.out.println("Base Rate Per Night: $" + baseRate);
        System.out.println("Seasonal Multiplier: " + seasonalMultiplier + "x");
        System.out.println("Extended Stay Discount: " + (int)extendedDiscount + "%");
        System.out.println("Loyalty Discount: " + (int)loyaltyDiscount + "%");
        System.out.println("Nightly Rate: $" + nightlyRate);
        System.out.println("Total Booking Cost: $" + totalBookingCost);
        System.out.println("Complimentary Upgrades: " + upgrades);

        sc.close();
    }
}

