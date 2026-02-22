import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String orderType = sc.nextLine();
        String loyaltyStatus = sc.nextLine();
        double orderValue = sc.nextDouble();
        sc.nextLine();
        String timeSlot = sc.nextLine();

        double baseDiscount = 0;
        double timeAdjustment = 0;
        double serviceFee = 0;
        String priority = "Medium";
        int prepTime = 20;

        if (loyaltyStatus.equals("Gold")) {
            baseDiscount = 15;
        } else if (loyaltyStatus.equals("Silver")) {
            baseDiscount = 10;
        } else if (loyaltyStatus.equals("Bronze")) {
            baseDiscount = 5;
        }

        if (timeSlot.equals("Late-Night")) {
            timeAdjustment = -5;
        }

        if (orderType.equals("Delivery")) {
            serviceFee = orderValue * 0.10;
        } else if (orderType.equals("Takeout")) {
            serviceFee = orderValue * 0.03;
        }

        if (timeSlot.equals("Peak")) {
            priority = "High";
            if (orderType.equals("Delivery")) prepTime = 25;
            if (orderType.equals("Takeout")) prepTime = 30; 
        } else if (timeSlot.equals("Late-Night")) {
            priority = "Low";
            prepTime = 15;
        } else {
            priority = "Medium";
            if (orderValue > 150) prepTime = 25;
            else prepTime = 20;
        }
        
        if(orderType.equals("Delivery") && loyaltyStatus.equals("Bronze") && timeSlot.equals("Peak")) prepTime = 30;

        double totalDiscount = baseDiscount + (timeAdjustment * -1);
        double discountedValue = orderValue * (1 - (totalDiscount / 100));
        double finalAmount = discountedValue + serviceFee;

        System.out.println("Order Type: " + orderType);
        System.out.println("Loyalty Status: " + loyaltyStatus);
        System.out.println("Order Value: $" + orderValue);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Base Discount: " + (int)baseDiscount + "%");
        System.out.println("Time-Based Adjustment: " + (int)timeAdjustment + "%");
        System.out.println("Service Fee: $" + serviceFee);
        System.out.println("Final Amount: $" + finalAmount);
        System.out.println("Kitchen Priority: " + priority);
        System.out.println("Estimated Prep Time: " + prepTime + " minutes");

        sc.close();
    }
}

