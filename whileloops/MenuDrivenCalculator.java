import java.util.*;
public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int choice;
         int function=0;
         System.out.println("Calculator Menu : ");
         System.out.println("1.Add");
         System.out.println("2.Subtract");
         System.out.println("3.Multiply");
         System.out.println("4.Divide");
         System.out.println("5.Exit");
            do{
                
                System.out.print("Choice :");
                choice=sc.nextInt();
                if(choice>=1 && choice<=4 ){
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    System.out.println("Enter two numbers :"+a+" "+b);
                    if(choice==1){
                        function=a+b;
                    } 
                    else if(choice==2){
                        function=a-b;
                    }
                    else if(choice==3){
                        function=a*b;
                    }
                    else if(choice==4){
                        function=a/b;
                    }

                
                System.out.println("Result :"+function);
                }

                if(choice==5){
                    System.out.println("Goodbye!");
                }
            }
                while(choice!=5);
                    sc.close();
        }
    
}
