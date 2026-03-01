import java.util.*;
public class StudentgradeAnalysis {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        double totalscore=0;
        int highestscore=0;
        int count=0;
        int fail=0;

        for(int i=0;i<n;i++){
            String studentname=sc.next();
            int score=sc.nextInt();
    
            totalscore=totalscore+score;
            if(score>highestscore){
                highestscore=score;
            }
 

            
            String grade; 
            if(score>=85){
                 grade="A";
            }
            else if(score>=70 ){
                grade="B";
            }
            else if(score>=60 ){
                grade="C";
            }
            else if(score>=50 ){
                grade="D";
            }
            else{
                grade="F";
            }
            String status;
            if(score>=60){
                status="Pass";
                count++;
            }
            else{
                status="Fail";
                fail++;
            }

          System.out.println("Student:"+ studentname);
          System.out.println("Score :"+ score);
          System.out.println("Letter Grade :"+ grade);
          System.out.println("Status :"+ status);
          System.out.println();
        }
          double classavg=totalscore/n;
          System.out.println("Total Students :"+ n);
          System.out.println("Class Average :"+ classavg);
          System.out.println("Highest Score :"+ highestscore);
          System.out.println("Students Passed:"+ count);
          System.out.println("Students Failed :"+  fail);
          sc.close();
    }
    
}
