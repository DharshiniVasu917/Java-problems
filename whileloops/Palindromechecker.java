import java.util.*;
public class Palindromechecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int rem=0,res=0;
        while(n>0){
            rem=n%10;
            res=res*10+rem;
            n=n/10;
        }
        if (original==res) {
            System.out.println(original+" is a palindrome");
        } else {
            System.out.println(original+" is not a palindrome");
        }
        sc.close();
    }
}
