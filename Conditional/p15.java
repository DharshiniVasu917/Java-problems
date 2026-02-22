import java.util.Scanner;

public class p15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userCount = sc.nextInt();
        sc.nextLine();
        String licenseType = sc.nextLine();
        String supportLevel = sc.nextLine();
        int contractYears = sc.nextInt();

        double basePrice = 0;
        double volumeDiscount = 0;
        double supportFee = 0;
        double multiYearDiscount = 0;
        String pricingTier = "";

        if (licenseType.equals("Standard")) {
            basePrice = 60.0;
        } else if (licenseType.equals("Professional")) {
            basePrice = 120.0;
        } else if (licenseType.equals("Enterprise")) {
            basePrice = 200.0;
        }

        if (userCount >= 1001) {
            volumeDiscount = 35;
        } else if (userCount >= 501) {
            volumeDiscount = 25;
        } else if (userCount >= 201) {
            volumeDiscount = 20;
        } else if (userCount >= 51) {
            volumeDiscount = 15;
        } else {
            volumeDiscount = 0;
        }

        if (supportLevel.equals("Basic")) {
            supportFee = 10.0;
        } else if (supportLevel.equals("Priority")) {
            supportFee = 30.0;
        } else if (supportLevel.equals("Premium")) {
            supportFee = 80.0;
        }

        if (contractYears == 2) {
            multiYearDiscount = 5;
        } else if (contractYears == 3) {
            multiYearDiscount = 10;
        } else if (contractYears == 5) {
            multiYearDiscount = 20;
        } else {
            multiYearDiscount = 0;
        }

        double discountedBase = basePrice * (1 - volumeDiscount / 100.0);
        double annualPerUser = (discountedBase + supportFee) * (1 - multiYearDiscount / 100.0);
        double totalAnnualCost = annualPerUser * userCount;
        double totalContractValue = totalAnnualCost * contractYears;

        if (userCount >= 1001 || (licenseType.equals("Enterprise") && userCount >= 501)) {
            pricingTier = "Enterprise";
        } else if (userCount >= 200) {
            pricingTier = "Mid-Market";
        } else {
            pricingTier = "Small Business";
        }

        System.out.println("User Count: " + userCount);
        System.out.println("License Type: " + licenseType);
        System.out.println("Support Level: " + supportLevel);
        System.out.println("Contract Duration: " + contractYears + " years");
        System.out.println("Base Price Per User: $" + basePrice);
        System.out.println("Volume Discount: " + (int) volumeDiscount + "%");
        System.out.println("Support Fee Per User: $" + supportFee);
        System.out.println("Multi-Year Discount: " + (int) multiYearDiscount + "%");
        System.out.println("Annual Cost Per User: $" + annualPerUser);
        System.out.println("Total Annual Cost: $" + totalAnnualCost);
        System.out.println("Total Contract Value: $" + totalContractValue);
        System.out.println("Pricing Tier: " + pricingTier);

        sc.close();
    }
}
