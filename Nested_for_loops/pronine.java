import java.util.*;
public class pronine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        System.out.println("Number Pyramid :");
        for(int i=1;i<=height;i++){
            for(int j=1;j<=height-i;j++){
                System.out.print(" ");
            }
                for(int k=1;k<=i;k++){
                    System.out.print(k);
                }
                 for(int l=i-1;l>=1;l--){
                    System.out.print(l);
                }  
            
            System.out.println();
        }
        sc.close();
    } 
    
}
