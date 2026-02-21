import java.util.Scanner;
public class p4 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String loyalty = sc.nextLine();
      double value = sc.nextDouble();
      sc.nextLine();
      String product = sc.nextLine();
      String status = sc.nextLine();

       int baseDiscount = 0;
      int additionalDiscount = 0;

      if (loyalty.equalsIgnoreCase("Bronze")) {
         baseDiscount = 5;
      } else if (loyalty.equalsIgnoreCase("Silver")) {
         baseDiscount = 8;
      } else if (loyalty.equalsIgnoreCase("Gold")) {
         baseDiscount = 12;
      } else if (loyalty.equalsIgnoreCase("Platinum")) {
         baseDiscount = 15;
      }

      if (value >= 500 && value <= 999) {
         additionalDiscount += 3;
      } else if (value >= 1000 && value <= 1999) {
         additionalDiscount += 5;
      } else if (value >= 2000) {
         additionalDiscount += 7;
      }

      if (product.equalsIgnoreCase("Electronics")) {
         if (status.equalsIgnoreCase("Prime")) {
            additionalDiscount += 5;
         }
      } else if (product.equalsIgnoreCase("Fashion")) {
         additionalDiscount += 3;
      } else if (product.equalsIgnoreCase("Books")) {
         if (status.equalsIgnoreCase("Prime")) {
            additionalDiscount += 5;
         }
      } else if (product.equalsIgnoreCase("Groceries")) {
         if (value > 300) {
            additionalDiscount += 2;
         }
      }

      int totalDiscount = baseDiscount + additionalDiscount;
      double savings = value * (1-totalDiscount / 100.0);
      double finalPrice = value - savings;

      System.out.println("Loyalty Tier: " + loyalty);
      System.out.println("Cart Value: $" + value);
      System.out.println("Product Category: " + product);
      System.out.println("Membership: " + status);
      System.out.println("Base Discount: " + baseDiscount + "%");
      System.out.println("Additional Discount: " + additionalDiscount + "%");
      System.out.println("Total Discount: " + totalDiscount + "%");
      System.out.format("Final Price: $%.1f\n", savings);
      System.out.format("Savings: $%.1f\n", finalPrice);

      sc.close();

   }
}
