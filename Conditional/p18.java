import java.util.Scanner;
public class p18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        sc.nextLine();
        String zone = sc.nextLine();
        String speed = sc.nextLine();
        String size = sc.nextLine();

        double baseRate = 0;
        double weightSurcharge = weight * 1.0;
        double zoneMultiplier = 1.0;
        double sizeSurcharge = 0;
        String deliveryTime = "";
        String serviceLevel = "";

        if (speed.equals("Economy")) {
            baseRate = 5.0;
            serviceLevel = "Budget";
            if (zone.equals("Local")) deliveryTime = "3-5";
            else if (zone.equals("Regional")) deliveryTime = "5-7";
            else if (zone.equals("National")) deliveryTime = "7-10";
            else if (zone.equals("International")) deliveryTime = "14-21";
        } else if (speed.equals("Standard")) {
            baseRate = 10.0;
            serviceLevel = "Standard";
            if (zone.equals("Local")) deliveryTime = "2-3";
            else if (zone.equals("Regional")) deliveryTime = "3-5";
            else if (zone.equals("National")) deliveryTime = "5-7";
            else if (zone.equals("International")) deliveryTime = "10-14";
        } else if (speed.equals("Express")) {
            baseRate = 25.0;
            serviceLevel = "Priority";
            if (zone.equals("Local")) deliveryTime = "1";
            else if (zone.equals("Regional")) deliveryTime = "1-2";
            else if (zone.equals("National")) deliveryTime = "2-3";
            else if (zone.equals("International")) deliveryTime = "3-5";
        } else if (speed.equals("Overnight")) {
            baseRate = 50.0;
            serviceLevel = "Premium";
            deliveryTime = "1";
        }

        if (zone.equals("Regional")) {
            zoneMultiplier = 1.2;
        } else if (zone.equals("National")) {
            zoneMultiplier = 1.5;
        } else if (zone.equals("International")) {
            zoneMultiplier = 3.0;
        }

        if (size.equals("Medium")) {
            sizeSurcharge = 5.0;
        } else if (size.equals("Large")) {
            sizeSurcharge = 15.0;
        } else if (size.equals("Oversized")) {
            sizeSurcharge = 30.0;
        }

        double totalCost = (baseRate + weightSurcharge) * zoneMultiplier + sizeSurcharge;

        System.out.println("Package Weight: " + weight + " lbs");
        System.out.println("Destination Zone: " + zone);
        System.out.println("Shipping Speed: " + speed);
        System.out.println("Package Size: " + size);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightSurcharge);
        System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
        System.out.println("Size Surcharge: $" + sizeSurcharge);
        System.out.println("Total Shipping Cost: $" + totalCost);
        System.out.println("Estimated Delivery: " + deliveryTime + " business days");
        System.out.println("Service Level: " + serviceLevel);

        sc.close();
    }
}

