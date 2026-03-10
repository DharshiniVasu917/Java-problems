import java.util.*;

public class StrongNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int original=number;
        int sum = 0;
        while (number>0) {
            int digit=number%10;
            int fact=1;
            int i=1;
            while (i<=digit) {
                fact=fact*i;
                i++;
            }
            sum=sum+fact;
            number=number/10;
        }
        if (sum==original) {
            System.out.println(original+" is a strong number");
        } else {
            System.out.println(original+" is not a strong number");
        }
        sc.close();
    }
}