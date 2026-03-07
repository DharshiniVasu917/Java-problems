import java.util.*;
public class GCDcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=0;
        int x=a;
        int y=b;
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD of "+x+" and "+y+" = "+a);
        sc.close();

    }
    
}
