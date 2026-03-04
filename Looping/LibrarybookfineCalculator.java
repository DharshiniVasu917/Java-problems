import java.util.*;
public class LibrarybookfineCalculator {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double dailyfinerates=0.0;
        double fine=0.0;
        double maximumfine=0;
        double actualfine=0;
        int overduecount=0;
        double averagefine=0.0;
        for(int i=1;i<=n;i++){
            String booktype=sc.next();
            int dayslate=sc.nextInt();
            if(booktype.equals("Regular")){
                dailyfinerates=0.50;
                maximumfine=10;
            }
            else if(booktype.equals("Reference")){
                dailyfinerates=1.00;
                maximumfine=20;

            }
            else if(booktype.equals("Magazine")){
                dailyfinerates=0.25;
                maximumfine=5;
            }
            fine=dayslate*dailyfinerates;
             double actualFine = Math.min(fine, maximumfine);
             if(dayslate>0){
                overduecount++;
             }
            fine+=actualfine;
            System.out.println("Book " + i + ": " + booktype);
            System.out.println("Days Late: " + dayslate);
            System.out.println("Daily Fine: $" + dailyfinerates);
            System.out.println("Calculated Fine: $" + fine);
            System.out.println("Actual Fine: $" + actualFine);
            System.out.println("Cap Applied: " + (fine > maximumfine ? "Yes" : "No"));
            System.out.println();
        } 
        averagefine=fine/n;
        System.out.println("Total Books: " + n);
        System.out.println("Total Fines Collected: $" + fine);
        System.out.println("Books Overdue: " + overduecount);
        System.out.println("Average Fine: $" + String.format("%.2f", averagefine));
        sc.close();

    }
}
