import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows, cols;

        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] c = new int[rows][cols];

        // Input Matrix A
        System.out.println("Enter elements of Matrix A:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
        System.out.println("Enter elements of Matrix B:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Addition
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Display Result
        System.out.println("Resultant Matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}