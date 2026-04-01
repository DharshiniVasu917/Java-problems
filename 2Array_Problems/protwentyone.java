import java.util.Scanner;

class ProTwentyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        boolean equal = true;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(a[i][j] != b[i][j]) {
                    equal = false;
                }
            }
        }

        if(equal)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
