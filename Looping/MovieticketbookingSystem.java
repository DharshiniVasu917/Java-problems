import java.util.*;
public class MovieticketbookingSystem {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double cost=0;
        int discount=0;
        double ticketprice=0;
        double originaltotal=0;
        double finaltotal=0;
        double totaldiscount=0;
        String groupdiscount="No";
        for(int i=1;i<=n;i++){
            String seattype=sc.next();
            String customertype=sc.next();
            if(seattype.equals("Regular")){
                cost=12;
            }
            else if(seattype.equals("Premium")){
                cost=18;
            }
            else if(seattype.equals("Recliner")){
                cost=25;
            }
            if(customertype.equals("Adult")){
               discount=0;
            }
            else if(customertype.equals("Child")){
               discount=30;
            }
            else if(customertype.equals("Senior")){
               discount=25;
            }
            ticketprice=cost*(1-discount/100.0);
            originaltotal+=cost;
            finaltotal+=ticketprice;
            System.out.println("Ticket "+i+":"+seattype+"-"+customertype);
            System.out.println("Base Price: $"+ cost);
            System.out.println("Discount:"+discount+"%");
            System.out.println("Final Price :$"+ticketprice);
            System.out.println();

        }
        if(n>=5){
            finaltotal=finaltotal*0.90;
            groupdiscount="Yes";
        }
        else{
            groupdiscount="No";
        }
        totaldiscount=originaltotal-finaltotal;
        System.out.println("Total Tickets:"+n);
        System.out.println("Original Total:$"+originaltotal);
        System.out.println("Total Discount:$"+String.format("%.2f",totaldiscount));
        System.out.println("Final Total:$"+finaltotal);
        System.out.println("Group Discount Applied :"+groupdiscount);
        sc.close();
    }
}
