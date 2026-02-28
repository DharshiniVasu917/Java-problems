import java.util.*;
public class SalaryProcessingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalPayroll = 0;
        for (int i = 1; i <= n; i++) {
            String name = sc.next();
            double baseSalary = sc.nextDouble();
            int rating = sc.nextInt();
            int incrementPct = 0;
            if (rating == 5) {
                incrementPct = 15;
            } else if (rating == 4) {
                incrementPct = 10;
            } else if (rating == 3) {
                incrementPct = 5;
            } else if (rating == 2) {
                incrementPct = 2;
            } else {
                incrementPct = 0;
            }
            double finalSalary = baseSalary * (1 + incrementPct / 100.0);
            totalPayroll += finalSalary;
            System.out.println("Employee: " + name);
            System.out.println("Base Salary: $" + baseSalary);
            System.out.println("Performance Rating: " + rating);
            System.out.println("Increment: " + incrementPct + "%");
            System.out.println("Final Salary: $" + finalSalary);
            System.out.println();
        }
        double averageSalary = totalPayroll / n;
        System.out.println("Total Employees Processed: " + n);
        System.out.println("Total Payroll: $" + totalPayroll);
        System.out.println("Average Salary: $" + String.format("%.2f", averageSalary));
        sc.close();
    }
}

