import java.util.*;
public class proeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();
        int days=sc.nextInt();
        int perfectcount=0;
        
        System.out.println("Attendance Matrix :");
        System.out.print("Student ");
        for (int i=1;i<=days;i++){
            System.out.print("Day "+i+" ");
        }
        System.out.print("Attendance %");
        System.out.println();

        for(int i=0;i<students;i++){
            String name=sc.next();
            int count=0;
            System.out.print(name+" ");
            for(int j=0;j<days;j++){
                String status = sc.next();
                System.out.print(status+" ");
            
             if(status.equals("p")){
                count++;
             }
            }
        double percentage=(count*100.0)/days;
        if(percentage==100.0){
            perfectcount++;
          }
          System.out.printf("%.2f%%",percentage);
          System.out.println();
        }
        System.out.println();
        System.out.println("Perfect Attendance :"+perfectcount);
        sc.close();

    }
    
}
