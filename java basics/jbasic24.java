import java.util.Scanner;
public class jbasic24 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int register=sc.nextInt();
        int broadcast=sc.nextInt();
        int sponsor=sc.nextInt();
        int prize=sc.nextInt();
        int rent=sc.nextInt();
        int add=sc.nextInt();
        int remaining;
        remaining=register+broadcast+sponsor-prize-rent-add;
        System.out.println(remaining);
        sc.close();
    }
    
}
