import java.util.Scanner;
public class jbasic6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int mileage=sc.nextInt();
        int fuel=sc.nextInt();
        int toll=sc.nextInt();
        int total;
        int fueln=distance/mileage;
        int fuelcost=fueln*fuel;
        total=fuelcost+toll;
        System.out.println(total);
        sc.close();
    }
    
}
