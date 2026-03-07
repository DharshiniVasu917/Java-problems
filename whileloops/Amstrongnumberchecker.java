import java.util.*;

public class Amstrongnumberchecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int temp=number;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        temp=number;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            int pow=1;
            int i=0;
           while(i<count){
            pow=pow*rem;
            i++;
           }
        sum+=pow;
        temp=temp/10;
        }
        if(sum==number){
            System.out.println(number+" is an Armstrong number");
        }
        else {
            System.out.println(number+" is not an Armstrong number");
        }
        sc.close();


    }
    
}
