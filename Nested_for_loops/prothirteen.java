import java.util.*;
public class prothirteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int totalStudents=sc.nextInt();
        int totalSeats=rows*cols;
        int studentNum=1;
        System.out.println("Exam Seating Plan:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                if((i + j)%2==0 && studentNum<=totalStudents){
                    System.out.print("S"+String.format("%03d",studentNum)+" ");
                    studentNum++;
                }
                else{
                    System.out.print("---- ");
                }

            }
            System.out.println();
        }

        int occupied=studentNum-1;
        int empty=totalSeats-occupied;
        System.out.println();
        System.out.println("Total Seats: "+totalSeats);
        System.out.println("Occupied Seats: "+occupied);
        System.out.println("Empty Seats: "+empty);
        sc.close();
    }
}
