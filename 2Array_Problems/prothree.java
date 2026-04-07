import java.util.*;
public class prothree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] grades=new int[n];
        for (int i=0;i<n;i++) {
            grades[i]=sc.nextInt();
        }
        int max=grades[0];
        int min=grades[0];
        int fail=0;
        for (int i=0;i<n;i++) {
            if (grades[i]>max) {
                max=grades[i];
            }
            if (grades[i]<min) {
                min=grades[i];
            }
            if (grades[i]<40) {
                fail++;
            }
        }
        double passPercentage=((n-fail)*100.0)/n;
        System.out.println("Total Students: "+n);
        System.out.println("Highest Score: "+max);
        System.out.println("Lowest Score: "+min);
        System.out.println("Failed Students: "+fail);
        System.out.printf("Pass Percentage: %.2f%%\n",passPercentage);
        sc.close();
    }
}