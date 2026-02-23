import java.util.Scanner;
public class p23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stockPercentage = sc.nextInt();
        int investmentYears = sc.nextInt();
        sc.nextLine();
        String riskTolerance = sc.nextLine();
        String marketVolatility = sc.nextLine();
        int bondAllocation = 100 - stockPercentage;
        int riskScore = stockPercentage;
        if (investmentYears >= 1 && investmentYears <= 5) {
            if (stockPercentage > 50) riskScore += 20;
        } else if (investmentYears >= 6 && investmentYears <= 10) {
            if (stockPercentage > 60) riskScore += 10;
        } else if (investmentYears >= 11 && investmentYears <= 20) {
            if (stockPercentage > 80) riskScore += 5;
        }
        if (marketVolatility.equals("Medium")) {
            riskScore += 10;
        } else if (marketVolatility.equals("High")) {
            riskScore += 20;
        }
        if (riskScore > 100) riskScore = 100;
        String riskCategory = "";
        if (riskScore <= 30) riskCategory = "Low";
        else if (riskScore <= 60) riskCategory = "Moderate";
        else if (riskScore <= 80) riskCategory = "High";
        else riskCategory = "Very High";
        String alignmentStatus = "";
        String recommendation = "";
        String suggestedRebalancing = "";
        if (riskTolerance.equals("Conservative")) {
            if (riskCategory.equals("Low")) {
                alignmentStatus = "Well Aligned";
                recommendation = "Portfolio is appropriately balanced for your profile";
                suggestedRebalancing = "No action needed";
            } else if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Acceptable";
                recommendation = "Portfolio is slightly more aggressive than your profile";
                suggestedRebalancing = "Consider reducing stocks to 20-30%";
            } else {
                alignmentStatus = "Misaligned";
                recommendation = "Portfolio risk significantly exceeds tolerance level";
                suggestedRebalancing = "Reduce stocks to 30-40%, increase bonds and cash";
            }
        } else if (riskTolerance.equals("Moderate")) {
            if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Well Aligned";
                recommendation = "Portfolio is appropriately balanced for your profile";
                suggestedRebalancing = "No action needed";
            } else if (riskCategory.equals("Low") || riskCategory.equals("High")) {
                alignmentStatus = "Acceptable";
                recommendation = "Portfolio risk is within acceptable range for your profile";
                suggestedRebalancing = "Monitor and adjust if your goals change";
            } else {
                alignmentStatus = "Misaligned";
                recommendation = "Portfolio risk is too high for your moderate profile";
                suggestedRebalancing = "Decrease stock allocation slightly";
            }
        } else if (riskTolerance.equals("Aggressive")) {
            if (riskCategory.equals("High") || riskCategory.equals("Very High")) {
                if (investmentYears >= 20 && marketVolatility.equals("High")) {
                    alignmentStatus = "Acceptable";
                    recommendation = "High risk level acceptable given long horizon and tolerance";
                    suggestedRebalancing = "Monitor closely, consider slight reduction if volatility persists";
                } else {
                    alignmentStatus = "Well Aligned";
                    recommendation = "Portfolio is appropriately balanced for your profile";
                    suggestedRebalancing = "No action needed";
                }
            } else if (riskCategory.equals("Moderate")) {
                alignmentStatus = "Acceptable";
                recommendation = "Portfolio is slightly more conservative than your profile";
                suggestedRebalancing = "Consider increasing stock allocation slightly";
            } else {
                alignmentStatus = "Misaligned";
                recommendation = "Portfolio is too conservative for your risk tolerance";
                suggestedRebalancing = "Increase stocks to 80-90% for better growth potential";
            }
        }
        System.out.println("Stock Allocation: " + stockPercentage + "%");
        System.out.println("Bond Allocation: " + bondAllocation + "%");
        System.out.println("Investment Horizon: " + investmentYears + " years");
        System.out.println("Risk Tolerance: " + riskTolerance);
        System.out.println("Market Volatility: " + marketVolatility);
        System.out.println("Portfolio Risk Score: " + riskScore + "/100");
        System.out.println("Risk Category: " + riskCategory);
        System.out.println("Alignment Status: " + alignmentStatus);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Suggested Rebalancing: " + suggestedRebalancing);

        sc.close();
    }
}

