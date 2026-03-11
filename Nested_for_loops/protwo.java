import java.util.*;
public class protwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int seatsperrows=sc.nextInt();
        int count=0;
        for(int i=1;i<=rows;i++){
            System.out.print("Row "+i+":");
            for(int j=1;j<=seatsperrows;j++){

                System.out.print("Seat-"+j+" ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total Seats :"+count);
        sc.close();
    }
    
}
