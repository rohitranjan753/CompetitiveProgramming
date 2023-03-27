// Maximum sum of hour glass in matrix

import java.util.*;

class HourGlass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scan.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the Matrix: ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int sum = 0, max = 0;
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < columns - 2; j++) {
                sum = (matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]) + (matrix[i + 1][j + 1])
                        + (matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2]);

                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println("The maximum sum in the hourglass is: " + max);
    }
}