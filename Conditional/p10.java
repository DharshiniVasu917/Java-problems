import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String timeOfDay = sc.nextLine();
        double powerConsumption = sc.nextDouble();
        double renewablePercentage = sc.nextDouble();
        sc.nextLine(); 
        String rateTier = sc.nextLine();

        double baseRate = 0.0;
        double multiplier = 1.0;
        String recommendation = "";
        double potentialSavings = 0.0;
        if (rateTier.equalsIgnoreCase("Basic")) {
            baseRate = 0.18;
        } else if (rateTier.equalsIgnoreCase("Time-of-Use")) {
            baseRate = 0.15;
        } else if (rateTier.equalsIgnoreCase("Premium-Green")) {
            baseRate = 0.12;
        }
        if (timeOfDay.equalsIgnoreCase("Peak")) {
            if (rateTier.equalsIgnoreCase("Time-of-Use")) {
                multiplier = 1.8;
            } else {
                multiplier = 1.5;
            }
        
            if (renewablePercentage > 75.0) {
                recommendation = "Great renewable usage! Minor peak reduction possible";
                potentialSavings = (powerConsumption * baseRate * multiplier) * 0.15; // Estimated 15% reduction
            } else {
                recommendation = "Shift high-power appliances to Off-Peak hours";
                potentialSavings = (powerConsumption * baseRate * multiplier) - (powerConsumption * baseRate * 0.8);
            }
        } 
        else if (timeOfDay.equalsIgnoreCase("Off-Peak")) {
            if (rateTier.equalsIgnoreCase("Basic")) {
                multiplier = 1.0;
                recommendation = "Consider upgrading to Time-of-Use plan";
                potentialSavings = (powerConsumption * baseRate) - (powerConsumption * 0.15 * 0.8);
            } else {
                multiplier = 0.8;
                recommendation = "Good timing! Consider increasing renewable capacity";
                potentialSavings = 0.0;
            }
        } 
        else if (timeOfDay.equalsIgnoreCase("Super-Off-Peak")) {
            if (rateTier.equalsIgnoreCase("Premium-Green")) {
                multiplier = 0.6;
            } else {
                multiplier = 0.5;
            }
            recommendation = "Excellent! Maximize appliance use during this period";
            potentialSavings = 0.0;
        }
        double renewableCredit = (powerConsumption * (renewablePercentage / 100.0)) * baseRate;
        double rawCost = (powerConsumption * baseRate * multiplier) - renewableCredit;
        double totalCost = Math.max(0.0, rawCost);


        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + powerConsumption + " kWh");
        System.out.println("Renewable Energy: " + renewablePercentage + "%");
        System.out.println("Rate Tier: " + rateTier);
        System.out.println("Base Rate: $" + baseRate + "/kWh");
        System.out.println("Rate Multiplier: " + multiplier + "x");
        System.out.println("Renewable Credit: $" + Math.round(renewableCredit * 100.0) / 100.0);
        System.out.println("Total Cost: $" + Math.round(totalCost * 100.0) / 100.0);
        System.out.println("Optimization Recommendation: " + recommendation);
        System.out.println("Potential Savings: $" + Math.round(potentialSavings * 100.0) / 100.0);

        sc.close();
    }
}
