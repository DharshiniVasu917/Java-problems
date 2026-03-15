import java.util.*;
public class protwenty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] original=new int[rows][cols];
        int[][] transposed=new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                original[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transposed[j][i]=original[i][j];
            }
        }
        System.out.println("Original Matrix ("+rows+" x "+cols+"):");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(original[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Transposed Matrix ("+cols+" x "+rows+"):");
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(transposed[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
