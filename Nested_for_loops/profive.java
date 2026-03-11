import java .util.*;
public class profive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int daysinmonths=sc.nextInt();
        int startday=sc.nextInt();
          System.out.println("Calendar Grid :");
          System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        int date=1;
        int totalcells=startday-1+daysinmonths;
          for(int i=1;i<=totalcells;i++){
            if(i<startday){
                System.out.println(" ");
            }
            else{
                System.out.println(date+" ");
                date++;
            }
            if(i%7==0){
                System.out.println();

            }

        }
        if(totalcells%7!=0){
            System.out.println();

        }
        sc.close();
    }
}
