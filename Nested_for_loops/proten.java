import java.util.*;
public class proten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int products=sc.nextInt();
        int vendors=sc.nextInt();
        System.out.println("Price Comparison Matrix :");
        System.out.println("Product ");
        for(int i=0;i<vendors;i++){
            System.out.print("vendor "+i+" ");
        }
        System.out.print("BestPrice");
        System.out.println();
        for(int i=1;i<=products;i++){
            String name=sc.next();
            System.out.print(name+" ");
            double min=Double.MIN_VALUE;

            for(int j=1;j<=vendors;j++){
                int prices=sc.nextInt();
                 
                System.out.printf("%.2f",prices);
                 min = Math.min(min, prices);

            }
            System.out.printf("%.2f\n",min);

        }
        sc.close();
    }
    
}
