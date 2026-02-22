import java.util.Scanner;
public class p19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movieFormat = sc.nextLine();
        String showTime = sc.nextLine();
        String seatCategory = sc.nextLine();
        String customerType = sc.nextLine();
        double basePrice = 12.0;
        double formatSurcharge = 0.0;
        double seatUpgradeFee = 0.0;
        double timeAdjustment = 0.0;
        double customerDiscount = 0.0;
        String voucher = "No";
        String pricingCategory = "";
        if (movieFormat.equals("3D")) {
            formatSurcharge = 5.0;
        } else if (movieFormat.equals("IMAX")) {
            formatSurcharge = 8.0;
        } else if (movieFormat.equals("4DX")) {
            formatSurcharge = 10.0;
        }
        if (seatCategory.equals("Premium")) {
            seatUpgradeFee = 4.0;
        } else if (seatCategory.equals("Recliner")) {
            seatUpgradeFee = 7.0;
        }
        if (showTime.equals("Matinee")) {
            timeAdjustment = -30.0;
            voucher = "Yes";
        } else if (showTime.equals("Prime-Time")) {
            timeAdjustment = 20.0;
        } else if (showTime.equals("Late-Night")) {
            timeAdjustment = -20.0;
        }
        if (customerType.equals("Senior")) {
            customerDiscount = 25.0;
            voucher = "Yes";
        } else if (customerType.equals("Student")) {
            customerDiscount = 15.0;
            voucher = "Yes";
        } else if (customerType.equals("Child")) {
            customerDiscount = 30.0;
            voucher = "Yes";
        }
        double baseWithSurcharges = basePrice + formatSurcharge + seatUpgradeFee;
        double adjustedPrice = baseWithSurcharges * (1 + timeAdjustment / 100.0);
        double finalPrice = adjustedPrice * (1 - customerDiscount / 100.0);
        if (finalPrice < 10.0) {
            pricingCategory = "Value";
        } else if (finalPrice <= 20.0) {
            pricingCategory = "Standard";
        } else if (finalPrice <= 30.0) {
            pricingCategory = "Premium";
        } else {
            pricingCategory = "Luxury";
        }
        System.out.println("Movie Format: " + movieFormat);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Category: " + seatCategory);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Base Ticket Price: $" + basePrice);
        System.out.println("Format Surcharge: $" + formatSurcharge);
        System.out.println("Seat Upgrade Fee: $" + seatUpgradeFee);
        System.out.println("Time-Based Adjustment: " + (int)timeAdjustment + "%");
        System.out.println("Customer Discount: " + (int)customerDiscount + "%");
        System.out.println("Final Ticket Price: $" + (double)finalPrice * 100 / 100);
        System.out.println("Concession Voucher: " + voucher);
        System.out.println("Pricing Category: " + pricingCategory);

        sc.close();
    }
}

