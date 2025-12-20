import java.util.Scanner;
public class matrixsum02 {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
        int[][] matrixA=new int[2][3];
        int[][] matrixB=new int[2][3];
        int[][] matrixC=new int[2][3];

        for(int i=0;i<2;i++){
            System.out.println();
            for(int j=0;j<3;j++){
                System.out.print("Enter element at :");
                matrixA[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<2;i++){
            System.out.println();
            for(int j=0;j<3;j++){
                System.out.print("Enter element at :");
                matrixB[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<2;i++){
            System.out.println();
            for(int j=0;j<3;j++){
                matrixC[i][j]=matrixA[i][j]+matrixB[i][j];
                System.out.print(matrixC[i][j] + " ");

            }
        }
    }
    }
}
