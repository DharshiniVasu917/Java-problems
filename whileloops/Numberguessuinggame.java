import java.util.*;
public class Numberguessuinggame {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);    
    
    int secretnumber=sc.nextInt();
    
    int attempt=0;
    int i=1;
        while( i!=0){
            int userguesses=sc.nextInt();
               System.out.println("Guesss the number (1100) :"+userguesses);

            if(secretnumber<userguesses){
                System.out.println("Too low!");
            }
            else if(secretnumber>userguesses){
                System.out.println("Too low!");
            }
           else {
                attempt++;
                System.out.println("Correct! Attempts :"+ attempt);
                i=0;
                break;


           }
        } 
        sc.close();
   }
}
