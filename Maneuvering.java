// Maneuvering

import java.util.*;

class Maneuvering {
    static int pathCalculationReverse(int rows, int columns) {
        if (rows == 1 || columns == 1) {
            return 1;
        }
        return pathCalculationReverse(rows - 1, columns) + pathCalculationReverse(rows, columns - 1);
    }

    static int pathCalculation(int rows, int columns) {
        if (rows == rows - 1 || columns == columns - 1) {
            return 1;
        }
        return pathCalculation(rows, columns + 1) + pathCalculation(rows + 1, columns);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        // System.out.println(pathCalculation(row, col));

        System.out.println(pathCalculationReverse(row, col));
    }
}