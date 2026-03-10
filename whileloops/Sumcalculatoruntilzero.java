import java.util.*;
public class Sumcalculatoruntilzero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,count=0;
        System.out.print("Enter number (0 to stop) :");
        int n=sc.nextInt();
        while(n>0){
            sum=sum+n;
            count++;
            System.out.print("Enter number (0 to stop) :");
            n=sc.nextInt();
        }
            System.out.println("Total Sum :"+sum);
            System.out.println("Count :"+count); 
            sc.close();
    }
    
}
