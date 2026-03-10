import java.util.*;
public class primenumberchecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2,sum=0;
        while(i<n){
            if(n%i==0){
                sum=1;
                break;
            }
            i++;
        }
        if(sum==0){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" is not prime");
        }
        
        sc.close();
    }
}
