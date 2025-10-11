import java.util.Scanner;

public class multiplication_2d_Array {
    public static void main(String[] args) {
        System.out.println("This code contains info about Arrays");

        // Declare large enough arrays to hold matrix elements
        int[][] a = new int[100][100];
        int[][] a2 = new int[100][100];

        int b1, b2, d1, d2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for 1st Array: ");
        b1 = sc.nextInt();
        System.out.print("Enter the number of columns for 1st Array: ");
        b2 = sc.nextInt();

        System.out.println("Enter values for 1st Array:");
        for (int i = 0; i < b1; i++) {
            for (int j = 0; j < b2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number of rows for 2nd Array: ");
        d1 = sc.nextInt();
        System.out.print("Enter the number of columns for 2nd Array: ");
        d2 = sc.nextInt();

        System.out.println("Enter values for 2nd Array:");
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                a2[i][j] = sc.nextInt();
            }
        }

        // Print first matrix
        System.out.println("First Matrix:");
        for (int i = 0; i < b1; i++) {
            for (int j = 0; j < b2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Print second matrix
        System.out.println("Second Matrix:");
        for (int i = 0; i < d1; i++) {
            for (int j = 0; j < d2; j++) {
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }

        // Your original code had this condition incorrectly written as (b1 != d1).
        // It should check if number of columns of first matrix equals rows of second matrix:
        if (b2 != d1) {
            System.out.println("Wrong combination of Matrices are given");
            System.out.println("NOTE: Number of columns of first matrix must be equal to number of rows of second matrix.");
            return; // Stop execution if dimensions mismatch
        }

        // Initialize the result matrix with proper dimensions
        int[][] r = new int[b1][d2];

        // Your nested loops order and multiplication formula were incorrect:
        // You should multiply elements as: r[i][j] += a[i][k] * a2[k][j];
        for (int i = 0; i < b1; i++) {
            for (int j = 0; j < d2; j++) {
                r[i][j] = 0;
                for (int k = 0; k < b2; k++) {
                    r[i][j] += a[i][k] * a2[k][j];
                }
            }
        }

        // Your original printing code printed the result multiple times inside the loop over k.
        // Printing should be done only once per element outside the innermost loop:
        System.out.println("\nThis is the product of two matrices:");
        for (int i = 0; i < b1; i++) {
            for (int j = 0; j < d2; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
}
