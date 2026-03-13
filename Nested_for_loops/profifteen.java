import java.util.*;
public class profifteen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int products=sc.nextInt();
        double total=0;
        System.out.println("Star Rating Matrix:");
        System.out.println("Product Rating Stars");
        for(int i=1;i<=products;i++) {
            String name=sc.next();
            double rating=sc.nextDouble();
            total=total+rating;
            System.out.print(name+" "+rating+" ");
            int fullStars=(int)rating;
            for(int j=1;j<=5;j++) {
                if(j<=fullStars) {
                    System.out.print("★");
                } else {
                    System.out.print("☆");
                }
            }
            System.out.println();
        }
        double avg=total/products;
        System.out.printf("\nAverage Rating: %.2f",avg);
        sc.close();
    }
}
