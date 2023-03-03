import java.util.*;

class RemainderTheorem {
    public static void main(String[] args) {
        int num[] = { 5, 7, 35 };
        int rem[] = { 3, 5, 33 };
        // int num[] = { 3, 4, 5 };
        // int rem[] = { 2, 3, 1 };
        int i = 0;

        int x = 1, n = 2600;
        while (x < n) {

            for (i = 0; i < rem.length; i++) {
                if (x % num[i] != rem[i]) {
                    break;
                }
            }
            if (i == rem.length) {
                System.out.println(x);
            }
            x++;
        }
    }
}