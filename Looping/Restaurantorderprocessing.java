import java.util.*;
public class Restaurantorderprocessing {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double itemsubtotal=0.0;
    double subtotal=0.0;
    int itemcount=0;
    double tax=0.0;
    double servicecharge=0.0;
    double grandtotal=0.0;
    for(int i=0;i<n;i++){
        String itemname=sc.next();
        double price=sc.nextDouble();
        int quantity = sc.nextInt();
        itemsubtotal=price*quantity;
        subtotal+=itemsubtotal;
        itemcount+=quantity;
        System.out.println("Item :"+itemname);
        System.out.println("Price :$ "+price+"x"+quantity);
        System.out.println("Subtotal:$"+itemsubtotal);
        System.out.println();
    }
        tax=subtotal*0.08;
        servicecharge=subtotal*0.10;
        grandtotal=subtotal+tax+servicecharge;
        System.out.println("Total Item :"+ itemcount);
        System.out.println("Subtotal: $"+subtotal);
        System.out.println("Tax (8%):$"+String.format("%.2f", tax));
        System.out.println("Service Charge (10%):$ "+ String.format("%.2f",servicecharge));
        System.out.println("Grand Total:$"+String.format("%.2f",grandtotal));
       sc.close();   
  }  
}
