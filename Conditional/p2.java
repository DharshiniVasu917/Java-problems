import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int creditscore=sc.nextInt();
        double annualincomme=sc.nextDouble();
        double debt=sc.nextDouble();
        sc.nextLine();
        String loantype=sc.nextLine();
        String decision="Rejected";
        double maxloan=0.0;
        if(creditscore>=600 && debt<=50.0)
        if(creditscore>=750){
            if(debt<=30){
                decision="Approved";
            if(loantype.equals("Home")){
                maxloan=annualincomme*4;
             }
             else if(loantype.equals("Buisness")){
                maxloan=annualincomme*3;
             }
             else if(loantype.equals("Personal")){
                maxloan=annualincomme*1;
             }
            }
        }
            else if(debt<=40.0){
                if(loantype.equals("Buisness")){
                    decision="Approved";
                    maxloan=annualincomme*3;
                }
                else if(loantype.equals("Personal")){
                    decision="Needs Review";
                    maxloan=annualincomme*0.5;
                }
                else if(loantype.equals("Home")){
                    decision="Needs Review";
                    maxloan=annualincomme*3;
                }
            }
            else if(creditscore>=700){
                if(debt<=40.0){
                 
                if(loantype.equals("Home")){
                    decision="Needs Review";
                      maxloan=annualincomme*3;
                }
                  else if(loantype.equals("Buisness")){
                    decision="Approved";
                    maxloan=annualincomme*3;
                  }
                  else{
                    decision="Needs Review";
                    maxloan=annualincomme*0.5;
                  }
                }
            }
        else if(creditscore>=650){
            if(debt<=40.0)
                decision="Needs Review";
            if(loantype.equals("Home")){
                maxloan=annualincomme*3;

            }
            else if(loantype.equals("Personal")){
                maxloan=annualincomme*0.5;
            }
        }
        System.out.println("Credit Score :"+ creditscore);
        System.out.println("Annual Income :$"+ annualincomme);
        System.out.println("Debt-to-Income Ratio:"+ debt +"%");
        System.out.println("Loan Type :"+ loantype);
        System.out.println("Decision :"+ decision);
        System.out.println("Maximum Loan Amount :$"+maxloan);

        sc.close();
        

    }
    
}
