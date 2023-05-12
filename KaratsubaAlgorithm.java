public class KaratsubaAlgorithm {
    public static void main(String[] args) {
        int x = 1234;
        int y = 5678;

        int result = karatsuba(x, y);
        System.out.println("Result: " + result);
    }

    public static int karatsuba(int x, int y) {
        int n = Math.max(Integer.toString(x).length(), Integer.toString(y).length());

        if (n == 1) {
            return x * y;
        }

        int halfN = n / 2;

        int a = x / (int) Math.pow(10, halfN);
        int b = x % (int) Math.pow(10, halfN);
        int c = y / (int) Math.pow(10, halfN);
        int d = y % (int) Math.pow(10, halfN);

        int ac = karatsuba(a, c);
        int bd = karatsuba(b, d);
        int abcd = karatsuba(a + b, c + d);

        int adbc = abcd - ac - bd;

        int result = (int) (ac * Math.pow(10, 2 * halfN) + adbc * Math.pow(10, halfN) + bd);

        System.out.println("n: " + n);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("ac: " + ac);
        System.out.println("bd: " + bd);
        System.out.println("abcd: " + abcd);
        System.out.println("adbc: " + adbc);
        System.out.println("Result: " + result);
        System.out.println();

        return result;
    }
}
