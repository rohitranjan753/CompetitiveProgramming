
// Leader elements in array
import java.util.*;

class LeadersElement {

    static void leaderElement(int array[]) {
        int leaderElementVal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < leaderElementVal) {
                System.out.print(leaderElementVal + "->");
                leaderElementVal = array[i];
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        leaderElement(arr);
    }
}