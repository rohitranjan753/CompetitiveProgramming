import java.util.Scanner;

public class NQueenProblem {
    // public int N = 0;
    // public int solutions_count = 0;

    // /* A utility function to print solution */
    // void printSolution(int board[][]) {
    // System.out.println("Solution No. " + solutions_count);
    // System.out.println("==================");
    // for (int i = 0; i < N; i++) {
    // for (int j = 0; j < N; j++)
    // System.out.print(" " + board[i][j]
    // + " ");
    // System.out.println();
    // }
    // System.out.println();
    // }

    // boolean isSafe(int board[][], int row, int col) {
    // int i, j;

    // for (i = 0; i < col; i++)
    // if (board[row][i] == 1)
    // return false;

    // for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
    // if (board[i][j] == 1)
    // return false;

    // for (i = row, j = col; j >= 0 && i < N; i++, j--)
    // if (board[i][j] == 1)
    // return false;

    // for (i = col + 1; i < N; i++)
    // if (board[row][i] == 1)
    // return false;

    // for (i = row, j = col; i >= 0 && j < N; i--, j++)
    // if (board[i][j] == 1)
    // return false;

    // for (i = row, j = col; j < N && i < N; i++, j++)
    // if (board[i][j] == 1)
    // return false;
    // return true;
    // }

    // void solveNQUtil(int board[][], int col) {

    // if (col >= N) {
    // solutions_count += 1;
    // return;
    // }

    // for (int i = 0; i < N; i++) {
    // if (isSafe(board, i, col)) {
    // board[i][col] = 1;

    // solveNQUtil(board, col + 1);

    // board[i][col] = 0; // BACKTRACK
    // }
    // }
    // printSolution(board);

    // }

    // int find_solutions(NQueenProblem Queen) {
    // int n = Queen.N;
    // int[][] board = new int[n][n];
    // Queen.solveNQUtil(board, 0);
    // return solutions_count;

    // }

    // // driver
    // public static void main(String args[]) {
    // Scanner keybd = new Scanner(System.in);
    // System.out.println("How many Queens?");
    // int n = keybd.nextInt();
    // NQueenProblem Queen = new NQueenProblem();
    // Queen.N = n;
    // System.out.print("Number of Solutions for " + n + " queens on " + n + "x" + n
    // + " chess board is -> "
    // + Queen.find_solutions(Queen) + "\n\n\n");

    // }

    static int[] a = new int[100];
    static int c = 0;

    static void queen(int k, int n) {
        for (int i = 1; i <= n; i++) {
            if (isSafe(k, i) == 1) {
                a[k] = i;// Assigning Queen and checking for the conditon.
                if (k == n) // End of Length of Board of Queens
                {
                    c++;
                    System.out.println("Solution :" + c);
                    // Prints all possible Solution of 'N' Queens
                    print(n);
                    System.out.println();
                } else {
                    queen(k + 1, n);// Checking the isSafe function until length
                }
            }
        }
    }

    static void print(int n) {
        char[][] b = new char[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            int j = a[i];
            b[i][j] = 'Q'; // Presence of Queen is represented by 'Q'
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (b[i][j] != 'Q')
                    System.out.print('.' + " ");
                else
                    System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int isSafe(int k, int i) {
        for (int j = 1; j <= (k - 1); j++) {
            if (a[j] == i || ((Math.abs(a[j] - i)) == (Math.abs(j - k)))) // Diagonality Check between Queens
            {
                return 0;// Presence of Queen
            }
        }
        return 1;// Queen can be placed
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Queens :");
        int n = s.nextInt();
        queen(1, n);
    }

}