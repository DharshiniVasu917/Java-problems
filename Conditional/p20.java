import java.util.Scanner;
public class p20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storageGB = sc.nextInt();
        int userCount = sc.nextInt();
        sc.nextLine();
        String backupFrequency = sc.nextLine();
        String supportTier = sc.nextLine();
        double baseStorageCost = 0;
        if (storageGB <= 100) {
            baseStorageCost = storageGB * 0.05;
        } else if (storageGB <= 500) {
            baseStorageCost = (100 * 0.05) + ((storageGB - 100) * 0.05);
        } else if (storageGB <= 2000) {
            baseStorageCost = (100 * 0.05) + (400 * 0.05) + ((storageGB - 500) * 0.03);
        } else {
            baseStorageCost = (100 * 0.05) + (400 * 0.05) + (1500 * 0.03) + ((storageGB - 2000) * 0.02);
        }
        double perUserRate = 0;
        if (userCount <= 10) {
            perUserRate = 5.0;
        } else if (userCount <= 50) {
            perUserRate = 4.0;
        } else {
            perUserRate = 3.0;
        }
        double perUserFee = userCount * perUserRate;

        double backupPremium = 0;
        if (backupFrequency.equals("Hourly")) {
            backupPremium = 15.0 + (userCount * 0.50);
        } else if (backupFrequency.equals("Real-Time")) {
            backupPremium = 50.0 + (userCount * 1.0);
        }
        double supportFee = 0;
        if (supportTier.equals("Standard")) {
            supportFee = 20.0;
        } else if (supportTier.equals("Priority")) {
            supportFee = 75.0;
        } else if (supportTier.equals("Enterprise")) {
            supportFee = 200.0;
        }
        double monthlySubscription = baseStorageCost + perUserFee + backupPremium + supportFee;
        double annualSubscription = (monthlySubscription * 12) * 0.9;
        String recommendedPlan = "";
        String includedFeatures = "";
        if (userCount == 1) {
            recommendedPlan = "Personal";
            includedFeatures = "Basic storage, file sync";
        } else if (userCount <= 20) {
            recommendedPlan = "Team";
            includedFeatures = "Version history, file sharing, basic analytics";
        } else if (userCount <= 100) {
            recommendedPlan = "Business";
            includedFeatures = "Advanced sharing, team analytics, priority support";
        } else {
            recommendedPlan = "Enterprise";
            includedFeatures = "Advanced security, compliance tools, dedicated support, API access";
        }
        System.out.println("Storage Capacity: " + storageGB + " GB");
        System.out.println("User Count: " + userCount);
        System.out.println("Backup Frequency: " + backupFrequency);
        System.out.println("Support Tier: " + supportTier);
        System.out.println("Base Storage Cost: $" + baseStorageCost);
        System.out.println("Per-User Fee: $" + perUserFee);
        System.out.println("Backup Premium: $" + backupPremium);
        System.out.println("Support Fee: $" + supportFee);
        System.out.println("Monthly Subscription: $" + monthlySubscription);
        System.out.println("Annual Subscription: $" + annualSubscription + " (save 10%)");
        System.out.println("Recommended Plan: " + recommendedPlan);
        System.out.println("Included Features: " + includedFeatures);

        sc.close();
    }
}

