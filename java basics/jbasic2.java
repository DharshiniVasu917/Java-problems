import java.util.Scanner;
class jbasic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int basecost=sc.nextInt();
        int extragb=sc.nextInt();
        int ratepgb=sc.nextInt();
        int tax=sc.nextInt();
       float ec=extragb*ratepgb;
       float st=basecost+ec;
         float tbill;
        tbill=st+(st*tax/100);
        System.out.println(tbill);
        sc.close();
     
    }
}