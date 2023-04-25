import java.util.Scanner;

public class NQueenProblem {
    public int N = 0;
    public int solutions_count = 0;

    /* A utility function to print solution */
    void printSolution(int board[][]) {
        System.out.println("Solution No. " + solutions_count);
        System.out.println("==================");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
        System.out.println();
    }

    boolean isSafe(int board[][], int row, int col) {
        int i, j;

        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        for (i = col + 1; i < N; i++)
            if (board[row][i] == 1)
                return false;

        for (i = row, j = col; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; j < N && i < N; i++, j++)
            if (board[i][j] == 1)
                return false;
        return true;
    }

    void solveNQUtil(int board[][], int col) {

        if (col >= N) {
            solutions_count += 1;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;

                solveNQUtil(board, col + 1);

                board[i][col] = 0; // BACKTRACK
            }
        }

    }

    int find_solutions(NQueenProblem Queen) {
        int n = Queen.N;
        int[][] board = new int[n][n];
        Queen.solveNQUtil(board, 0);
        return solutions_count;

    }

    // driver
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);
        System.out.println("How many Queens?");
        int n = keybd.nextInt();
        NQueenProblem Queen = new NQueenProblem();
        Queen.N = n;
        System.out.print("Number of Solutions for " + n + " queens on " + n + "x" + n + " chess board is -> "
                + Queen.find_solutions(Queen) + "\n\n\n");
    }
}