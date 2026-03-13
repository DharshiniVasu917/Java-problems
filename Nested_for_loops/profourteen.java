import java.util.*;

public class profourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int top=0,bottom=size-1;
        int left=0,right=size-1;
        int num=1;
        System.out.println("Spiral Matrix:");
        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                System.out.print(num+" ");
                num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(num+" ");
                num++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(num+" ");
                    num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(num+" ");
                    num++;
                }
                left++;
            }
        }
        sc.close();
    }
}
