import java.util.*;
public class BlooddonationcampEligibilitychecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int eligible=0;
        int rejected=0;
        String reason="";
        double eligiblityrate=0.0;
        String status="Not Eligible";
        for(int i=1;i<=n;i++){
            String donourname=sc.next();
            int age=sc.nextInt();
            double weight=sc.nextDouble();
            double hemoglobin=sc.nextDouble();
            if((age>=18 && age<=65) && (weight>=50) && (hemoglobin>=12.5)){
                eligible++;
                status="Eligible";
            }
            else {
                if (age < 18) {
                status="Not Eligible";
                reason="Age below 18 years";
                rejected++;
                }
                if(age>65){
                 status="Not Eligible";
                 reason="Age is above 65 years"; 
                 rejected++; 
                }
                else if(weight<50){
                 status="Not Eligible";
                 reason="Under Weight"; 
                 rejected++; 
                }
                else if (hemoglobin<12.5){
                 status="Not Eligible";
                 reason="Hemoglobin is below 12.5 g/dl"; 
                 rejected++; 
                }

            }
            System.out.println("Donor: " + donourname);
            System.out.println("Age: " + age + " years");
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Hemoglobin: " + hemoglobin + " g/dL");
            System.out.println("Status: " + status);
            if (status.equals("Not Eligible")) {
                System.out.println("Reason: " + reason);
            }

            System.out.println();

        }
        eligiblityrate = (eligible * 100.0) / n;
        System.out.println("Total Donors: " + n);
        System.out.println("Eligible Donors: " + eligible);
        System.out.println("Rejected Donors: " + rejected);
        System.out.println("Eligibility Rate: " + String.format("%.1f", eligiblityrate) + "%");
        sc.close();
    }
}
