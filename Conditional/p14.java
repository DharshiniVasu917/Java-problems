import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tier = sc.nextLine();
        int months = sc.nextInt();
        sc.nextLine();
        String access = sc.nextLine();
        String addOns = sc.nextLine();

        double baseFee = 0;
        double discount = 0;
        double accessFee = 0;
        double addOnFee = 0;
        String category = "";

        if (tier.equals("Basic")) {
            baseFee = 40.0;
        } else if (tier.equals("Premium")) {
            baseFee = 80.0;
        } else if (tier.equals("Elite")) {
            baseFee = 120.0;
        } else if (tier.equals("VIP")) {
            baseFee = 150.0;
        }

        if (months == 6) {
            discount = 10;
        } else if (months == 12) {
            discount = 15;
        } else if (months == 24) {
            discount = 25;
        } else {
            discount = 0;
        }

        if (access.equals("Regional")) {
            accessFee = 20.0;
        } else if (access.equals("Nationwide")) {
            accessFee = 50.0;
        }
        else{
            accessFee=0.0;
        }

        if (addOns.equals("Personal-Training")) {
            addOnFee = 100.0;
        } else if (addOns.equals("Classes")) {
            addOnFee = 50.0;
        } else if (addOns.equals("Full-Package")) {
            addOnFee = 200.0;
        }

        double BaseAfterDiscount = baseFee * (1 - (discount / 100.0));
        double monthlyTotal =BaseAfterDiscount + accessFee + addOnFee;
        double contractTotal = monthlyTotal * months;
        
        double monthToTotal = (baseFee + accessFee + addOnFee) * months-contractTotal;

        if (tier.equals("VIP")) {
            category = "Luxury";
        } else if (tier.equals("Elite") || (tier.equals("Premium") && months == 12 && addOns.equals("Personal-Training"))) {
            category = "Premium";
        } else if (tier.equals("Basic")) {
            category = "Budget";
        } else {
            category = "Standard";
        }

        System.out.println("Membership Tier: " + tier);
        System.out.println("Contract Length: " + months + " months");
        System.out.println("Access Level: " + access);
        System.out.println("Add-Ons: " + addOns);
        System.out.println("Base Monthly Fee: $" + baseFee);
        System.out.println("Contract Discount: " + (int)discount + "%");
        System.out.println("Access Fee: $" + accessFee);
        System.out.println("Add-On Fee: $" + addOnFee);
        System.out.println("Monthly Total: $" + monthlyTotal);
        System.out.println("Contract Total: $" + contractTotal);
        System.out.println("Savings vs Month-to-Month: $" + monthToTotal);
        System.out.println("Membership Category: " + category);

        sc.close();
    }
}

