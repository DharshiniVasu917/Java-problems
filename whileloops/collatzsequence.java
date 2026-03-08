import java.util.Scanner;

public class collatzsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int steps = 0;
        int temp = n;

        System.out.println("Collatz sequence starting from " + n + ":");
        System.out.print(temp);

        if (temp != 1) {
            do {
                if (temp % 2 == 0) {
                    temp=temp/2;
                } else {
                    temp=3*temp+1;
                }
                System.out.print(" "+temp);
                steps++;
            } while (temp!=1);
        }

        System.out.println();
        System.out.println("Steps: " + steps);
        sc.close();
    }
}
