import java.util.Scanner;

class Symmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Check square matrix
        if (rows != cols) {
            System.out.println("Not a symmetric matrix");
            return;
        }

        int matrix[][] = new int[rows][cols];

        // 🔹 Input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 🔹 Check symmetry
        boolean isSymmetric = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        // 🔹 Output result
        if (isSymmetric) {
            System.out.println("Matrix is Symmetric");
        } else {
            System.out.println("Matrix is NOT Symmetric");
        }
    }
}