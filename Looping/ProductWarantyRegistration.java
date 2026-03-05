import java.util.*;
public class ProductWarantyRegistration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int active=0;
        int expiringsoon=0;
        int expired=0;
        for(int i=0;i<n;i++){
            String productid=sc.next();
            String producttype=sc.next();
            int monthsused=sc.nextInt();
            int warrantyperiod=0;
            String status="";
            if (producttype.equals("Electronics")) {
                warrantyperiod=12;
            } else if (producttype.equals("Appliance")) {
                warrantyperiod=24;
            } else if (producttype.equals("Computer")) {
                warrantyperiod=36;
            }
            int remaining=warrantyperiod-monthsused;
            if (remaining<0) {
                remaining=0;
            }
            if (remaining==0) {
                status="Expired";
                expired++;
            } 
            else if (remaining>=1 && remaining<=3) {
                status="Expiring Soon";
                expiringsoon++;
            } else {
                status="Active";
                active++;
            }
            System.out.println("Product ID: "+productid);
            System.out.println("Type: "+producttype);
            System.out.println("Warranty Period: "+warrantyperiod +" months");
            System.out.println("Months Used: "+monthsused);
            System.out.println("Remaining: "+remaining +" months");
            System.out.println("Status: "+status);
            System.out.println();
        }

        System.out.println("Total Products: "+n);
        System.out.println("Active Warranties: "+active);
        System.out.println("Expiring Soon: "+expiringsoon);
        System.out.println("Expired Warranties: "+expired);
        sc.close();


        
    }
    
}
