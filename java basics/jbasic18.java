import java.util.Scanner;
class jbasic18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int reg=sc.nextInt();
        int sponsor=sc.nextInt();
        int stall=sc.nextInt();
        int stage=sc.nextInt();
        int celibrity=sc.nextInt();
        int marketing=sc.nextInt();
        int finalbill;
        finalbill=reg+sponsor+stall-stage-celibrity-marketing;
        System.out.println(finalbill);
        sc.close();
     
    }
}