import java.util.Scanner;

public class Main {

    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = maximum(a, b);

        System.out.println(result);
    }
}
