import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double gpa=sc.nextDouble();
        double income=sc.nextDouble();
        int score=sc.nextInt();
        sc.nextLine();
        String types=sc.nextLine();
  String eligibility = "Not Eligible";
        double amount = 0.0;
        String category = "None";

        if (gpa >= 2.5) {
            if (types.equalsIgnoreCase("Merit")) {
                if (gpa >= 3.8 && score >= 80) {
                    eligibility = "Eligible";
                    amount = 25000.0;
                    category = "Full";
                } else if (gpa >= 3.5 && score >= 70) {
                    eligibility = "Eligible";
                    amount = 15000.0;
                    category = "Partial";
                } else if (gpa >= 3.0 && score >= 60) {
                    eligibility = "Eligible";
                    amount = 8000.0;
                    category = "Minimal";
                }
            } else if (types.equalsIgnoreCase("Need-Based")) {
                if (income <= 30000 && gpa >= 3.5) {
                    eligibility = "Eligible";
                    amount = 30000.0;
                    category = "Full";
                } else if (income <= 50000 && gpa >= 3.0) {
                    eligibility = "Eligible";
                    amount = 18000.0;
                    category = "Partial";
                } else if (income <= 70000 && gpa >= 2.8) {
                    eligibility = "Eligible";
                    amount = 10000.0;
                    category = "Minimal";
                }
            } else if (types.equalsIgnoreCase("Sports")) {
                if (score >= 85 && gpa >= 3.0) {
                    eligibility = "Eligible";
                    amount = 22000.0;
                    category = "Full";
                } else if (score >= 75 && gpa >= 2.8) {
                    eligibility = "Eligible";
                    amount = 20000.0;
                    category = "Partial";
                } else if (score >= 65 && gpa >= 2.5) {
                    eligibility = "Eligible";
                    amount = 12000.0;
                    category = "Minimal";
                }
            }
        }

        System.out.println("GPA: " + gpa);
        System.out.println("Family Income: $" + income);
        System.out.println("Extracurricular Score: " + score);
        System.out.println("Scholarship Type: " + types);
        System.out.println("Eligibility: " + eligibility);
        System.out.format("Award Amount: $%.1f\n", amount);
        System.out.println("Award Category: " + category);

        sc.close();
    }
}
