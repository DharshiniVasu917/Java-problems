import java.util.Scanner;

class ProFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter elements:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of each row:");

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Row " + i + " sum = " + sum);
        }
    }
}
