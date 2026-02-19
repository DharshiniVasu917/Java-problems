import java.util.Scanner;

public class jbasic22 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int copies=sc.nextInt();
        int cost=sc.nextInt();
        int editing=sc.nextInt();
        int design=sc.nextInt();
        int commision=sc.nextInt();
        int marketing=sc.nextInt();
        int profit;
        profit=(copies*cost)+editing+design-commision-marketing;
        System.out.println(profit);
        sc.close();
    }
    
}
