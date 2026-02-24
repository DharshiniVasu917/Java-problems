import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dataGB = sc.nextDouble();
        int callMinutes = sc.nextInt();
        sc.nextLine();
        String internationalUsage = sc.nextLine();
        String deviceType = sc.nextLine();

        String recommendedPlan = "";
        double basePlanCost = 0.0;
        double dataOverage = 0.0;
        double callOverage = 0.0;
        double internationalFee = 0.0;
        double deviceFee = 0.0;
        double potentialSavings = 0.0;
        String planCategory = "";

        if (dataGB <= 2.0 && callMinutes <= 300 && !internationalUsage.equals("Moderate") && !internationalUsage.equals("Heavy")) {
            recommendedPlan = "Basic 2GB";
            basePlanCost = 25.0;
            planCategory = "Budget";
        } else if (dataGB <= 5.0 && callMinutes <= 500 && !internationalUsage.equals("Moderate") && !internationalUsage.equals("Heavy")) {
            recommendedPlan = "Standard 5GB";
            basePlanCost = 40.0;
            planCategory = "Standard";
        } else if (dataGB <= 25.0 && callMinutes <= 2000) {
            recommendedPlan = "Premium Unlimited";
            basePlanCost = 70.0;
            planCategory = "Premium";
        } else {
            recommendedPlan = "Unlimited Max";
            basePlanCost = 90.0;
            planCategory = "Unlimited";
        }

        if (dataGB > 5.0 && recommendedPlan.equals("Standard 5GB")) {
            dataOverage = (dataGB - 5.0) * 10.0;
            potentialSavings = 5.0;
        }

        if (internationalUsage.equals("Light")) internationalFee = 5.0;
        else if (internationalUsage.equals("Moderate")) internationalFee = 15.0;
        else if (internationalUsage.equals("Heavy")) internationalFee = 30.0;

        if (deviceType.equals("Smartphone") || deviceType.equals("Tablet")) deviceFee = 10.0;
        else if (deviceType.equals("Hotspot")) deviceFee = 20.0;

        double totalMonthlyCost = basePlanCost + dataOverage + callOverage + internationalFee + deviceFee;

        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + callMinutes + " minutes");
        System.out.println("International Usage: " + internationalUsage);
        System.out.println("Device Type: " + deviceType);
        System.out.println("Recommended Plan: " + recommendedPlan);
        System.out.println("Base Plan Cost: $" + basePlanCost);
        System.out.println("Data Overage: $" + dataOverage);
        System.out.println("Call Overage: $" + callOverage);
        System.out.println("International Fee: $" + internationalFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + totalMonthlyCost);
        System.out.println("Potential Savings: $" + potentialSavings);
        
        if (dataGB != 25.0) {
            System.out.println("Plan Category: " + planCategory);
        }

        sc.close();
    }
}


