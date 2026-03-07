import java.util.*;
public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        int i=1;
        System.out.println("Fibonacci sequence ("+n+" terms):");
        while(i<=n){
            System.out.print(a + " ");
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        sc.close();
    }
    
}
