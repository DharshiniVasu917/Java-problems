import java.util.*;
public class digitsumcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Number :"+n);
        int sum=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum of digits :"+sum);
        sc.close();
    }
    
}
