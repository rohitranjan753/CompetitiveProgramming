// Maneuvering

import java.util.*;
class Maneuvering{

    static int pathCalculation(int rows, int columns){
        if(rows == rows-1 || columns == columns-1){
            return 1;
        }
        return pathCalculation(rows, columns+1)+pathCalculation(rows+1, columns);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        pathCalculation(row, col);
    }
}