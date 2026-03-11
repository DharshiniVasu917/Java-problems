import java.util.*;
public class prothree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        sc.nextLine();
        String character=sc.nextLine();
        System.out.println("Right Triangle Pattern :");
        for(int i=1;i<=height;i++){
            for(int j=1;j<=i;j++){
                if(character.equals("star")){
                    System.out.print("*");
            }
                else{
                    System.out.print(j);

                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
