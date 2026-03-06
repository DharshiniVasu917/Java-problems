import java.util.*;
public class ElectricityBillcalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
         double average=0;
        double tieredpricing=0;
        int totalunits=0;
        double totalrevenue=0;

        for(int i=0;i<n;i++){
            String consumerid=sc.next();
            int unitsconsumed=sc.nextInt();
        
            String usage="Low Usage";
    
            if(unitsconsumed<=100){
                tieredpricing=unitsconsumed*0.10;
                usage="Low Usage";
            }
            else if(unitsconsumed<=200){
                tieredpricing = (100 * 0.10) + ((unitsconsumed - 100) * 0.13);
                usage="Low Usage";
            }
            else if(unitsconsumed<=300){
                tieredpricing=(100 * 0.10) + (100 * 0.13) + ((unitsconsumed - 200) * 0.13);
                usage="Medium Usuage";
            }
            else if(unitsconsumed>=300){
               tieredpricing = (100 * 0.10) + (100 * 0.13) + (100 * 0.16) + ((unitsconsumed - 300) * 0.20);
                usage="High Usage";
            }
            totalrevenue=totalrevenue+tieredpricing;
             totalunits=totalunits+unitsconsumed;


             System.out.println("Consumer ID :"+consumerid);
             System.out.println("Units Consumed :"+unitsconsumed);
             System.out.println("Bill Amount : $"+tieredpricing);
             System.out.println("Category : "+ usage);
             System.out.println();
        }
        average=tieredpricing/n;
        System.out.println("Total Consumers :"+n);
        System.out.println("Total Units Consumed :"+totalunits);
        System.out.println("TotalRevenue :$"+totalrevenue);
        System.out.println("Average Bill :$"+average);
        sc.close();

    }

    
}
