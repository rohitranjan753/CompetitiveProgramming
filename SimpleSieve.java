import java.util.*;

class SimpleSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean primeArray[] = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            primeArray[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            if (primeArray[i] == true) {
                // int j=2*i;j<=n;j=j+i
                // int j=i*i;j<=n;j=j+i
                for (int j = i; j <= n; j++) {
                    if ((i * j) <= n) {
                        primeArray[(i * j)] = false;
                    }
                }
            }
        }

        for (int k = 2; k <= n; k++) {
            if (primeArray[k] == true)
                System.out.println("INDEX: " + k);
        }
    }
}