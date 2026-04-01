import java.util.Scanner;

class ProTwentyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(a[i][j] > max) {
                    second = max;
                    max = a[i][j];
                } else if(a[i][j] > second && a[i][j] != max) {
                    second = a[i][j];
                }
            }
        }

        System.out.println(second);
    }
}
