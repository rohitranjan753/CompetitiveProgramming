import java.util.*;

class Leaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int start = arr[n - 1];
        int max = start;
        int c = 1;
        System.out.println("Leader- " + max + " with index " + (n - 1));
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                c++;
                System.out.println("Leader1- " + max + " with index " + i);
            }
        }
        System.out.println("\nPossible Count of leaders is " + c);
    }
}