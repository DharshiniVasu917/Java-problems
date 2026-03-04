import java.util.*;
public class ParkingFeecalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int hourlyrate=0;
        double fee=0.0;
        int dailycap=0;
        double finalfee=0;
        int peakhour=0;
        double totalrevenue=0;
        for(int i=1;i<=n;i++){
            String vehicletype=sc.next();
            double hoursparked=sc.nextDouble();
            if(vehicletype.equals("Car")){
                hourlyrate=3;
                dailycap=30;

            }
            else if(vehicletype.equals("Motorcycle")){
                hourlyrate=2;
                dailycap=20;
            }
            else if(vehicletype.equals("Truck")){
                hourlyrate=5;
                dailycap=60;
            }
            else if(vehicletype.equals("Bus")){
                hourlyrate=7;
                dailycap=100;
            }
            fee=hoursparked*hourlyrate;
            boolean capapplied=false;
            finalfee=fee;
            if(fee>dailycap){
                finalfee=dailycap;
                capapplied=true;
            }
            if(hoursparked>8){
                peakhour++;
            }
            totalrevenue+=finalfee;
            System.out.println("Vehicle " + i + ": " + vehicletype);
            System.out.println("Hours Parked: " + hoursparked);
            System.out.println("Hourly Rate: $" + hourlyrate);
            System.out.println("Parking Fee: $" + finalfee);
            System.out.println("Cap Applied: " + (capapplied ? "Yes" : "No"));
            System.out.println();
        }

        double averagefee = totalrevenue / n;
        System.out.println("Total Vehicles: " + n);
        System.out.println("Total Revenue: $" + totalrevenue);
        System.out.println("Average Fee: $" + String.format("%.2f", averagefee));
        System.out.println("Peak Hour Vehicles (>8 hours): " + peakhour);
        sc.close();

    }
    
}
