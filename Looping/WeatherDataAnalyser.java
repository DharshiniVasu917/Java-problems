import java.util.*;
public class WeatherDataAnalyser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String status="";
        int hothours=0;
        int coldhours=0;
        int totaltemp=0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        int highhour = 0;
        int lowhour = 0;
        for(int i=0;i<n;i++){
            int hour=sc.nextInt();
            double temperature=sc.nextDouble();
            if(temperature>40 || temperature<0){
                status="Extreme";
            }
            else if(temperature>=32){
                status="Hot";
                
            }
            else if(temperature>=10 ){
                status="Normal";
            }
            else {
                status ="Cold";
                
            }
            if (temperature >= 32) {
                hothours++;
            }
            if (temperature >= 0 && temperature <= 10) {
                coldhours++;
            }

            totaltemp+=temperature;
            if (temperature > highest) {
                highest = temperature;
                highhour = hour;
            }
            System.out.println("Hour " + hour + ": " + temperature + "°C");
            System.out.println("Status: " + status);
            System.out.println();

        }
        double average=totaltemp/n;
        System.out.println("Total Readings: " + n);
        System.out.println("Average Temperature: " + String.format("%.2f", average) + "°C");
        System.out.println("Highest Temperature: " + highest + "°C at Hour " + highhour);
        System.out.println("Lowest Temperature: " + lowest + "°C at Hour " + lowhour);
        System.out.println("Hot Hours: " + hothours);
        System.out.println("Cold Hours: " + coldhours);
        sc.close();
    }
    
}
