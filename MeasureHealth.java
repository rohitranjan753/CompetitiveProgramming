
//
import java.util.*;

class MeasureHealth {

    static void calculateoxygenLevel(int arr[][], int round) {
        int oxygenLevelSum = 0;
        for (int i = 0; i < round; i++) {
            for (int j = 0; j < round; j++) {
                oxygenLevelSum = oxygenLevelSum + arr[i][j];
            }
            if ((oxygenLevelSum / 3) < 70) {
                System.out.println("Trainer " + (i + 1) + " is Unfit");
            }
            oxygenLevelSum = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int round = scanner.nextInt();

        int[][] runningArray = new int[round][round];
        System.out.println("Enter Oxygen level: ");
        for (int i = 0; i < round; i++) {
            for (int j = 0; j < round; j++) {

                runningArray[i][j] = scanner.nextInt();
                if (runningArray[i][j] > 100) {
                    System.out.println("Invalid input:");
                    System.exit(0);
                }
            }
        }
        calculateoxygenLevel(runningArray, round);
    }
}