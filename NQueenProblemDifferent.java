import java.util.*;

public class NQueenProblemDifferent {
	static int N = 0;

	void printSolution(int board[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + board[i][j]
						+ " ");
			System.out.println();
		}
	}

	boolean isSafe(int board[][], int row, int col) {
		if (row >= 0 && row < N && col >= 0 && col < N) {// out of bound
			int i, j;
			for (i = row; i >= 0; i--) {
				if (board[i][col] == 1)
					return false; // upper part
			}
			for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
				if (board[i][j] == 1)
					return false; // left upper diagnal
			}
			for (i = row, j = col; j < N && i >= 0; i--, j++) {
				if (board[i][j] == 1)
					return false; // right upper diagnal
			}
			return true;
		} else {
			return false;
		}
	}

	boolean solveNQUtil(int board[][], int row) {
		// chechking row wise here , online col wise
		if (row == N)
			return true;
		for (int i = 0; i < N; i++) {
			if (isSafe(board, row, i)) {
				board[row][i] = 1; // place one as soon as the is safe returns true

				if (solveNQUtil(board, row + 1))// next row if the 1 is safely placed
					return true; // true returned
				board[row][i] = 0; // BACKTRACK
			}
		}
		return false; // when all the 4 possoiblety is checked
		// then only backtrated to last and no insertion is possible to previsous rows
	}

	boolean solveNQ() {
		int board[][] = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = 0;
			}
		}
		if (solveNQUtil(board, 0) == false) {
			System.out.print("Solution does not exist");
			return false;
		}
		printSolution(board);
		return true;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		N = scanner.nextInt();
		NQueenProblemDifferent Queen = new NQueenProblemDifferent();
		Queen.solveNQ();
	}
}