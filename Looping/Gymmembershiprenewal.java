import java.util.*;
public class Gymmembershiprenewal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int discount=0;
        String priority="";
        double finalfee=0.0;
        int renewalfees=0;
        int count=0;
        double totalrevenue=0;

        for(int i=1;i<=n;i++){
            String membername = sc.next();
            String membershiptype=sc.next();
            int day=sc.nextInt();
            if(membershiptype.equals("Basic")){
                renewalfees=50;
            }
            else if(membershiptype.equals("Premium")){
                renewalfees=100;
            }
            else if(membershiptype.equals("VIP")){
                renewalfees=200;
            }
            if(day>=45){
                discount=50;
            }
            else if(day<=30){
                discount=100;
            }
            else if(day<=15){
                discount=10;
            }
            else{
                discount=0;
                priority="Urgent";
            }
            if (day < 10) {
                priority = "Urgent";
                count++;
            } 
            else if (day <= 30) {
                priority = "High";
            } 
            else {
                priority = "Normal";
            }
            finalfee= renewalfees * (1 - discount/100);  
            totalrevenue += finalfee;
            System.out.println("Member: "+membername);
            System.out.println("Membership: "+membershiptype);
            System.out.println("Days Until Expiry: "+day);
            System.out.println("Renewal Fee: $"+renewalfees+".0");
            System.out.println("Discount: "+discount+"%");
            System.out.println("Final Fee: $"+finalfee);
            System.out.println("Priority: "+priority);
            System.out.println();
        }
        double average = totalrevenue / n;
        System.out.println("Total Members: "+n);
        System.out.println("Urgent Renewals: "+count);
        System.out.println("Total Renewal Revenue: $"+totalrevenue);
        System.out.println("Average Renewal Fee: $"+average);

        sc.close();
    }
    
}
