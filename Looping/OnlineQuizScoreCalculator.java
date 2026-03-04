import java.util.*;
public class OnlineQuizScoreCalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int calculatescore=0;
        String result="";
        int pass=0;
        int fail=0;
        int totalscore=0;
        int highscore=0;
        for(int i=1;i<=n;i++){
            String studentname=sc.next();
            int correctans=sc.nextInt();
            int wrongans=sc.nextInt();
            int unattempted=sc.nextInt();
            calculatescore=(correctans*4)-(wrongans*3);
            if(calculatescore>=32){
                result="Pass";
                pass++;
            }
            else{
                result="Fail";
                fail++;
            }
            highscore=Math.max(highscore,calculatescore);
            totalscore+=calculatescore;
            System.out.println("Student: "+studentname);
            System.out.println("Correct: "+correctans);
            System.out.println("Wrong: "+wrongans);
            System.out.println("Unattempted: "+unattempted);
            System.out.println("Score: "+calculatescore);
            System.out.println("Result: "+result);
            System.out.println();
        }
        double classAverage=(double)totalscore/n;
        System.out.println("Total Students: "+n);
        System.out.println("Pass Count: "+pass);
        System.out.println("Fail Count: "+fail);
        System.out.println("Class Average: "+classAverage);
        System.out.println("Highest Score: "+highscore);

        sc.close();
        
    }
    
}
