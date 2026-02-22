import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String studentStatus = sc.nextLine();
        int creditHours = sc.nextInt();
        sc.nextLine();
        String programType = sc.nextLine();
        String residency = sc.nextLine();

        double baseTuition = 0;
        double residencyMultiplier = 1.0;
        double programFee = 0;
        double activityFee = 0;
        String feeCategory = "";

        if (programType.equals("Undergraduate")) {
            baseTuition = 350.0;
        } else if (programType.equals("Graduate")) {
            baseTuition = 550.0;
        } else if (programType.equals("Professional")) {
            baseTuition = 800.0;
        }

        if (residency.equals("In-State")) {
            residencyMultiplier = 1.0;
        } else if (residency.equals("Out-of-State")) {
            residencyMultiplier = 2.5;
        } else if (residency.equals("International")) {
            residencyMultiplier = 3.0;
        }

        if (studentStatus.equals("Full-Time")) {
            activityFee = 200.0;
            if (programType.equals("Undergraduate")) programFee = 500.0;
            else if (programType.equals("Graduate")) programFee = 750.0;
            else if (programType.equals("Professional")) programFee = 1200.0;
        } else if (studentStatus.equals("Part-Time")) {
            activityFee = 100.0;
            if (programType.equals("Undergraduate")) programFee = 300.0;
            else if (programType.equals("Graduate")) programFee = 750.0;
            else if (programType.equals("Professional")) programFee = 900.0;
        } else if (studentStatus.equals("Continuing-Education")) {
            activityFee = 50.0;
            programFee = 150.0;
        }

        double tuitionCost = creditHours * baseTuition * residencyMultiplier;
        double totalFee = tuitionCost + programFee + activityFee;

        if (studentStatus.equals("Continuing-Education")) {
            feeCategory = "Reduced";
        } else if (residency.equals("Out-of-State") || residency.equals("International")) {
            feeCategory = "Premium";
        } else {
            feeCategory = "Standard";
        }

        System.out.println("Student Status: " + studentStatus);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Program Type: " + programType);
        System.out.println("Residency: " + residency);
        System.out.println("Base Tuition Per Credit: $" + baseTuition);
        System.out.println("Residency Multiplier: " + residencyMultiplier + "x");
        System.out.println("Program Fee: $" + programFee);
        System.out.println("Student Activity Fee: $" + activityFee);
        System.out.println("Total Registration Fee: $" + totalFee);
        System.out.println("Fee Category: " + feeCategory);

        sc.close();
    }
}

