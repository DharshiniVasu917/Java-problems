import java.util.Scanner;
public class p21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String locationZone = sc.nextLine();
        double parkingHours = sc.nextDouble();
        sc.nextLine();
        String vehicleType = sc.nextLine();
        String membershipStatus = sc.nextLine();
        double baseHourlyRate = 5.0;
        double zonePremium = 0;
        double vehicleSurcharge = 0;
        double membershipDiscount = 0;
        double dailyCap = 0;
        String rateCategory = "Standard";
        String dailyCapApplied = "No";
        if (locationZone.equals("Downtown")) {
            zonePremium = 50;
            dailyCap = 150;
            rateCategory = "Premium";
        } else if (locationZone.equals("Business-District")) {
            zonePremium = 30;
            dailyCap = 120;
            rateCategory = "Premium";
        } else if (locationZone.equals("Residential")) {
            zonePremium = 0;
            dailyCap = 60;
            rateCategory = "Standard";
        } else if (locationZone.equals("Airport")) {
            zonePremium = 100;
            dailyCap = 180;
            rateCategory = "Luxury";
        }
        if (vehicleType.equals("Motorcycle")) {
            vehicleSurcharge = -2.0;
        } else if (vehicleType.equals("SUV")) {
            vehicleSurcharge = 3.0;
        } else if (vehicleType.equals("Oversized")) {
            vehicleSurcharge = 5.0;
        }
        if (membershipStatus.equals("Monthly")) {
            membershipDiscount = 20;
        } else if (membershipStatus.equals("Annual")) {
            membershipDiscount = 25;
        } else if (membershipStatus.equals("VIP")) {
            membershipDiscount = 30;
        }
        double hourlyRateWithPremium = baseHourlyRate * (1 + zonePremium / 100.0);
        double totalHourlyRate = hourlyRateWithPremium + vehicleSurcharge;
        double rawFee = totalHourlyRate * parkingHours;
        double discountedFee = rawFee * (1 - membershipDiscount / 100.0);   
        double finalFee = discountedFee;
        if (parkingHours >= 24.0) {
            if (discountedFee > dailyCap) {
                finalFee = dailyCap;
                dailyCapApplied = "Yes";
            }
        }
        System.out.println("Location Zone: " + locationZone);
        System.out.println("Parking Duration: " + parkingHours + " hours");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Membership Status: " + membershipStatus);
        System.out.println("Base Hourly Rate: $" + baseHourlyRate);
        System.out.println("Zone Premium: " + (int)zonePremium + "%");
        System.out.println("Vehicle Size Surcharge: $" + (vehicleSurcharge < 0 ? 0.0 : vehicleSurcharge));
        System.out.println("Membership Discount: " + (int)membershipDiscount + "%");
        System.out.println("Total Parking Fee: $" + finalFee);
        System.out.println("Daily Cap Applied: " + dailyCapApplied);
        System.out.println("Rate Category: " + rateCategory);

        sc.close();
    }
}

