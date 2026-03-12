import java.util.*;
public class prosix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int a,b;
        System.out.println("Matrix A:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                 a=sc.nextInt();
                
                System.out.print(a+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix B:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                 b=sc.nextInt();
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum (A+B) :");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a=sc.nextInt();
                b=sc.nextInt();
                System.out.print((a+b)+" ");
            }
            System.out.println();
        }
        sc.close();
    }   
    
}
