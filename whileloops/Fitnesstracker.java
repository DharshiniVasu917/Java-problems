import java.util.*;
public class Fitnesstracker {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String fitnesslevel="Beginner";
        int totalduration=0;
        int totalcalories=0;
        double averagecal=0;
        for(int i=1;i<=n;i++){
            String activity=sc.next();
            int durationmins=sc.nextInt();
            int caloriesburnt=0;
            String intensity="Low";
            totalduration+=durationmins; 
            if(activity.equals("Running")){
                caloriesburnt=(10*durationmins)/durationmins;
                 intensity="High";

            }
            else if(activity.equals("Swimming")){
                caloriesburnt=12*durationmins;
                intensity="High";
            }
            else if(activity.equals("Cycling")){
                caloriesburnt=8*durationmins;
                intensity ="Moderate";
            }
            else if(activity.equals("Gym")){
                caloriesburnt=7*durationmins;
                intensity="Moderate";
            }
            else if(activity.equals("Walking")){
                caloriesburnt=4*durationmins;
                intensity="Low";
            }
            totalcalories+=caloriesburnt;
            averagecal=totalcalories/n;
            if(totalcalories<300){
                fitnesslevel="Beginner";

            }
            else if(totalcalories>300 && totalcalories<1000){
                fitnesslevel="Intermediate";
            }
            else if(totalcalories>1000){
                fitnesslevel="Advanced";
            }
           System.out.println("Session "+i+":"+activity);
           System.out.println("Duration :"+durationmins+" minutes");
           System.out.println("Calories Burned :"+caloriesburnt);
           System.out.println("Intensity :"+intensity);
           System.out.println();
        }
        System.out.println("Total Workouts :"+n);
        System.out.println("Total Duration :"+totalduration+"minutes");
        System.out.println("Total Calories Burned :"+totalcalories);
        System.out.println("Average Calories per Session:"+averagecal);
        System.out.println("Fitnesslevel:"+fitnesslevel);
        sc.close();

    }
}
