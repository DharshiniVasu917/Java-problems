import java.util.Scanner;
class jbasic17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();
        int rate=sc.nextInt();
        int design=sc.nextInt();
        int test=sc.nextInt();
        int advance=sc.nextInt();
        int finalbill;
        finalbill=(hours*rate)+design+test-advance;
        System.out.println(finalbill);
        sc.close();
     
    }
}