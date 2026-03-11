import java.util.*;
public class profour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();
        int subjects=sc.nextInt();
        String name=sc.next();
        System.out.println("Grade Sheet :");
        System.out.print("Student ");
        for(int i=1;i<=subjects;i++){
            System.out.print("Sub"+i+" ");
        }
        System.out.print(" Average");
        System.out.println();
        for(int i=0;i<students;i++){
            double sum=0;
            System.out.print(name+" ");
            for(int j=1;j<=subjects;j++){
                int mark=sc.nextInt();
                System.out.print(mark+" ");
                sum+=mark;
            }
            double avg=sum/subjects;
            System.out.printf("%.2f",avg);
            System.out.println();
            }
            sc.close();
        }

    }
    

