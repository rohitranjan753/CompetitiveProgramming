
// Rat in a maze
// (r>=0 && r<N-1 && c>=0 && c<N-1 && arr[i][c]==1)
//if(r==N-1 && c==N-1) && arr[r][c]==1)
import java.util.*;

class RatMaze {

    static int N = 0;

    static void printSolution(int sol[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(
                        " " + sol[i][j] + " ");
            System.out.println();
        }
    }

    static boolean checkisSafe(
            int maze[][], int x, int y) {
        return (x >= 0 && x < N && y >= 0
                && y < N && maze[x][y] == 1);
    }

    static boolean ratMaze(int maze[][]) {
        int sol[][] = new int[N][N];

        if (ratMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    static boolean ratMazeUtil(int maze[][], int x, int y,
            int sol[][]) {
        if (x == N - 1 && y == N - 1
                && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        if (checkisSafe(maze, x, y) == true) {

            if (sol[x][y] == 1)
                return false;

            sol[x][y] = 1;

            if (ratMazeUtil(maze, x + 1, y, sol))
                return true;

            if (ratMazeUtil(maze, x, y + 1, sol))
                return true;

            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row and column");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] maze = new int[rows][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                maze[i][j] = scanner.nextInt();
            }
        }
        N = rows;
        ratMaze(maze);
    }
}