// first find the frequency of the element

import java.util.*;

public class FrequencyElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (arr[i] == -1) {
                break;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }
            if (count > n / 2) {
                System.out.println("The frequency of " + arr[i] + " is " + count);
            }
            count = 0;
        }
    }
}