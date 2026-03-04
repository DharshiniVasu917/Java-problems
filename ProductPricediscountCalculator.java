import java.util.*;
public class ProductPricediscountCalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dis=0;
        double subtotal=0.0;
        double originaltotal=0.0;
        double finaltotal=0.0;
        double totaldiscount=0.0;
        double percentage=0.0;
        double stotal=0.0;
        int totalitems=0;
        for(int i=0;i<n;i++){
            String productname=sc.next();
            double price=sc.nextDouble();
            int quantity=sc.nextInt();
            if(quantity>=10)
               dis =20;
            else if(quantity>=5 && quantity<=9)
                dis=15;
            else if(quantity>=2 && quantity<=4)
                dis=10;
            else{
                dis=0;
            }
            subtotal=price*quantity;
            stotal=subtotal*(1-dis)/100.0;
            originaltotal+=subtotal;
            finaltotal+=stotal;
            totalitems+=quantity;

             System.out.println("Product :"+productname);
             System.out.println("Unit Price:$"+price);
             System.out.println("Quantity :"+quantity);
             System.out.println("Discount:"+dis+"%");
             System.out.println("Subtotal:$"+stotal);
             System.out.println();

        }
         
            totaldiscount=originaltotal-finaltotal; 
            if(originaltotal>0) 
            percentage=(totaldiscount/originaltotal)*100;
            System.out.println("Total Items:"+totalitems);
            System.out.println("Original Total:$"+originaltotal);
            System.out.println("Total Discount: $"+ totaldiscount);
            System.out.println("Final Total:$"+ finaltotal);
            System.out.println("Savings"+percentage+"%");
            sc.close();
    }
}    

