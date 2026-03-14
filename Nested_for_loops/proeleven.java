import java.util.*;
public class proeleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.println("Pascal's Triangle:");

        for(int i=0;i<rows;i++) {
            int value=1;

            for(int j=0;j<=i;j++) {
                System.out.print(value + " ");
                value=value*(i-j)/(j+1);
            }

            System.out.println();
        }
        sc.close();
    }
}
