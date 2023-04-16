
// New leader concepts
import java.util.*;

class NewLeader {
    static void leaderElement(int array[], int n) {
        int leaderElementVal = array[0];
        int c = 1;
        System.out.print(leaderElementVal + "->");
        for (int i = 1; i < n; i++) {
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