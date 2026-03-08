import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal=sc.nextInt();
        int n=decimal;
        int binary=0;
        int place=1;
        while (n>0) {
            int rem=n%2;
            binary=binary+rem*place;
            place=place*10;
            n=n/2;
        }
        System.out.println("Decimal: "+decimal);
        System.out.println("Binary: "+binary);

        sc.close();
    }
}
