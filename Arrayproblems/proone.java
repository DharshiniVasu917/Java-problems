import java.util.*;
public class proone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double[] salaries=new double[n];
        for (int i=0;i<n;i++) {
            salaries[i]=sc.nextDouble();
        }
        double sum=0;
        for (int i=0;i<n;i++) {
            sum+=salaries[i];
        }
        double average=sum/n;
        int count=0;
        for (int i=0;i<n;i++) {
            if (salaries[i]>average) {
                count++;
            }
        }
        double percentage=(count*100.0)/n;
        System.out.println("Total Employees: "+n);
        System.out.printf("Average Salary: %.2f\n",average);
        System.out.println("Employees Above Average: "+count);
        System.out.printf("Percentage: %.2f%%\n",percentage);
        sc.close();
    }
}
