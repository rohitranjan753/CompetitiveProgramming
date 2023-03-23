
// Leader elements in array
import java.util.*;

class LeadersElement {

    static void leaderElement(int array[], int n) {
        int leaderElementVal = array[n - 1];
        int c = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] > leaderElementVal) {
                leaderElementVal = array[i];
                c++;
                System.out.print(leaderElementVal + "->");
            }

        }
        System.out.println("leaders count" + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        leaderElement(arr, n);
    }
}