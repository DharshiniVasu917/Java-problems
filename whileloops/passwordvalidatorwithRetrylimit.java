import java.util.*;
public class passwordvalidatorwithRetrylimit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String correctpass=sc.nextLine();
        int i=3;
        while(i>0){
            System.out.println("Enter Password :");
            String n=sc.nextLine();
            if(n.equals(correctpass)){
                System.out.println("Access granted!");
                break;

            }
            else{
                i--;          
             if (i==0) {
                     System.out.println("Account locked!");
                 }
                 else {
                   System.out.println("Incorrect! Attempts remaining: " + i);
                    }
             
            }

        }
        sc.close();
        

    }
    
}
