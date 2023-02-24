import java.util.*;

class EulerPhiFunction {

    static int GCD(int a, int b) {
        if (a == 0)
            return b;
        return GCD(b % a, a);
    }

    public static void main(String[] args) {
        int b = 72;
        int count = 0;
        if (b > 0) {
            for (int a = 1; a < b; a++) {
                if (GCD(a, b) == 1) {
                    count++;
                    System.out.println(a);
                }
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}