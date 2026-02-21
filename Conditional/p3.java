import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        sc.nextLine();
        String smoking=sc.nextLine();
        sc.nextLine();
        String condition=sc.nextLine();
        sc.nextLine();
        String coverage=sc.nextLine();
        sc.nextLine();
         double percentage=0.0;
        double amt=0;
        if(age>=18 && age<=30){
            if (coverage.equals("Basic")){
              amt=200.0;
            }
            else if(coverage.equals("Standard")){
                amt=300.0;
            }
            else if(coverage.equals("Premium")){
                amt=500.0;
            }
        }
        if(age<=50){
            if(coverage.equals("Basic")){
                amt=250.0;
            }
            else if(coverage.equals("Standard")){
                amt=350.0;
            }
            else if(coverage.equals("Premium")){
                amt=600.0;
            }
        }
        if(age<=60){
            if(coverage.equals("Basic")){
                amt=350.0;
            }
            else if(coverage.equals("Standard")){
                amt=450.0;
            }
            else if(coverage.equals("Premium")){
                amt=700.0;
            }
        }
    
        if(age>=66){
            if(coverage.equals("Basic")){
                amt=400.0;
            }
            else if(coverage.equals("Standard")){
                amt=550.0;
            }
            else if(coverage.equals("Premium")){
                amt=800.0;
            }
        }
        if (smoking.equals("Smoker") && condition.equalsIgnoreCase("Yes")) {
            percentage = 0.70;
        } 
        else if (smoking.equalsIgnoreCase("Smoker")) {
           percentage = 0.40;
        } 
        else if (condition.equalsIgnoreCase("Yes")) {
            percentage = 0.30;
        }
        double risk=amt*percentage;
        double total=amt+risk;

        
         System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smoking);
        System.out.println("Pre-existing Conditions: " + condition);
        System.out.println("Coverage Tier: " + coverage);
        System.out.format("Base Premium: $%.1f\n", amt);
        System.out.format("Risk Surcharge: $%.1f\n", risk);
        System.out.format("Total Monthly Premium: $%.1f\n", total);
        sc.close();

    }
}
