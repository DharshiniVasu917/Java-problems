import java.util.*;
public class TaxiFareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalDistance = 0.0;
        double totalRevenue = 0.0;
        for (int i=1;i<=n;i++) {
            double distanceKm=sc.nextDouble();
            String timeOfDay=sc.next();
            double baseFare=3.0;
            double distanceCharge=distanceKm*1.0;
            double timeSurcharge=0.0;
            if (timeOfDay.equals("Evening")) {
                timeSurcharge=3.0;
            } 
            else if (timeOfDay.equals("Night")) {
                timeSurcharge=5.0;
            } 
            else if (timeOfDay.equals("Morning") || timeOfDay.equals("Afternoon")) {
                timeSurcharge=0.0;
            }
            double totalFare=baseFare+distanceCharge+timeSurcharge;
            totalDistance+=distanceKm;
            totalRevenue+=totalFare;
            System.out.println("Ride "+i);
            System.out.println("Distance: "+distanceKm+" km");
            System.out.println("Time: "+timeOfDay);
            System.out.println("Base Fare: $"+baseFare);
            System.out.println("Distance Charge: $"+distanceCharge);
            System.out.println("Time Surcharge: $"+timeSurcharge);
            System.out.println("Total Fare: $"+totalFare);
            System.out.println();
        }
        double averageFare=totalRevenue/n;
        System.out.println("Total Rides: "+n);
        System.out.println("Total Distance: "+totalDistance+" km");
        System.out.println("Total Revenue: $"+totalRevenue);
        System.out.println("Average Fare: $"+String.format("%.1f",averageFare));
        sc.close();
    }
}
