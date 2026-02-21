import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int performance=sc.nextInt();
        int years=sc.nextInt();
        sc.nextLine();
        String department=sc.nextLine();
        double basesalary=sc.nextDouble();
        double bonous=0;
        String status="Not Eligible";

        if(performance>=3){
          status="Eligible";
            if(department.equals("Critical" )){
                if(performance==5 && years>=5){
                    bonous=25;}
                else if(performance>=4 && years>=10){
                    bonous=22;  
                }
                else if(performance==4){
                      bonous=15;
                    
                }
                else if(performance==3){
                    bonous=10;
                }
            }
            if(department.equals("Non-Critical")  ){
                if(performance==5){
                    bonous=18;}
                else if(performance==4){
                    bonous=12;    
                }
                else if(performance==3){
                    bonous=8; 
                    
                }
            }
        }
       double calculate=basesalary*(bonous/100);
       System.out.println("Performance Rating : "+performance);
       System.out.println("Years of Service : "+years);
       System.out.println("Department : "+department);
       System.out.println("Bonous Percentage : "+ (int)bonous+"%");
       System.out.println("Bonous Amount : $"+calculate);
       System.out.println("Status : "+status);
        sc.close();

    }
}
