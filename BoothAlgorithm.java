// public class BoothAlgorithm {
//     public static void main(String[] args) {
//         int multiplicand = -9; // 1001 in binary
//         int multiplier = 7; // 0111 in binary

//         int result = boothAlgorithm(multiplicand, multiplier);
//         System.out.println(result);
//     }

//     public static int boothAlgorithm(int multiplicand, int multiplier) {
//         int product = 0;
//         int accumulator = 0;

//         int n = Integer.toBinaryString(multiplicand).length(); // Number of bits
//         int count = n;

//         System.out.printf("%7s %4s %4s %4s\n", "Count", "A", "Q", "Q(-1)");
//         System.out.printf("%7s %4s %4s %4s\n", "-----", "---", "---", "-----");
//         System.out.printf("%7s %4s %4s %4s\n", count, accumulator, multiplier, 0);

//         while (count > 0) {
//             int lsb = multiplier & 1;

//             if (lsb == 1) {
//                 accumulator += multiplicand;
//             } else if (lsb == 0 && (accumulator & 1) == 1) {
//                 accumulator += multiplicand;
//             }

//             accumulator >>= 1;
//             multiplier >>= 1;
//             count--;

//             // Check if we need to add or subtract multiplicand
//             if ((accumulator & (1 << (n - 1))) == 0) {
//                 product <<= 1;
//             } else {
//                 product = (product << 1) - multiplicand;
//             }

//             System.out.printf("%7s %4s %4s %4s\n", count, accumulator, multiplier, lsb);
//         }

//         return product;
//     }
// }

// Java code to implement booth's algorithm
class BoothAlgorithm {

    // function to perform adding in the accumulator
    static void add(int ac[], int x[], int qrn) {
        int i, c = 0;

        for (i = 0; i < qrn; i++) {

            // updating accumulator with A = A + BR
            ac[i] = ac[i] + x[i] + c;

            if (ac[i] > 1) {
                ac[i] = ac[i] % 2;
                c = 1;
            } else {
                c = 0;
            }
        }
    }

    // function to find the number's complement
    static void complement(int a[], int n) {
        int i;
        int[] x = new int[8];
        x[0] = 1;

        for (i = 0; i < n; i++) {
            a[i] = (a[i] + 1) % 2;
        }
        add(a, x, n);
    }

    // function ro perform right shift
    static void rightShift(int ac[], int qr[],
            int qn, int qrn) {
        int temp, i;
        temp = ac[0];
        qn = qr[0];

        System.out.print("\t\trightShift\t");

        for (i = 0; i < qrn - 1; i++) {
            ac[i] = ac[i + 1];
            qr[i] = qr[i + 1];
        }
        qr[qrn - 1] = temp;
    }

    // function to display operations
    static void display(int ac[], int qr[], int qrn) {
        int i;

        // accumulator content
        for (i = qrn - 1; i >= 0; i--) {
            System.out.print(ac[i]);
        }
        System.out.print("\t");

        // multiplier content
        for (i = qrn - 1; i >= 0; i--) {
            System.out.print(qr[i]);
        }
    }

    // Function to implement booth's algo
    static void boothAlgorithm(int br[], int qr[], int mt[],
            int qrn, int sc) {

        int qn = 0;
        int[] ac = new int[10];
        int temp = 0;
        System.out.print("qn\tq[n+1]\t\tBR\t\tAC\tQR\t\tsc\n");
        System.out.print("\t\t\tinitial\t\t");

        display(ac, qr, qrn);
        System.out.print("\t\t" + sc + "\n");

        while (sc != 0) {
            System.out.print(qr[0] + "\t" + qn);

            // SECOND CONDITION
            if ((qn + qr[0]) == 1) {
                if (temp == 0) {

                    // subtract BR from accumulator
                    add(ac, mt, qrn);
                    System.out.print("\t\tA = A - BR\t");

                    for (int i = qrn - 1; i >= 0; i--) {
                        System.out.print(ac[i]);
                    }
                    temp = 1;
                }

                // THIRD CONDITION
                else if (temp == 1) {
                    // add BR to accumulator
                    add(ac, br, qrn);
                    System.out.print("\t\tA = A + BR\t");

                    for (int i = qrn - 1; i >= 0; i--) {
                        System.out.print(ac[i]);
                    }
                    temp = 0;
                }
                System.out.print("\n\t");
                rightShift(ac, qr, qn, qrn);
            }

            // FIRST CONDITION
            else if (qn - qr[0] == 0) {
                rightShift(ac, qr, qn, qrn);
            }

            display(ac, qr, qrn);

            System.out.print("\t");

            // decrement counter
            sc--;
            System.out.print("\t" + sc + "\n");
        }
    }

    static void reverse(int a[]) {
        int i, k, n = a.length;
        int t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] mt = new int[10];
        int sc;
        int brn, qrn;

        // Number of multiplicand bit
        brn = 4;

        // multiplicand
        int br[] = { 0, 1, 1, 0 };

        // copy multiplier to temp array mt[]
        for (int i = brn - 1; i >= 0; i--) {
            mt[i] = br[i];
        }

        reverse(br);

        complement(mt, brn);

        // No. of multiplier bit
        qrn = 4;

        // sequence counter
        sc = qrn;

        // multiplier
        int qr[] = { 1, 0, 1, 0 };
        reverse(qr);

        boothAlgorithm(br, qr, mt, qrn, sc);

        System.out.print("\n"
                + "Result = ");

        for (int i = qrn - 1; i >= 0; i--) {
            System.out.print(qr[i]);
        }
    }
}

/* This code contributed by PrinciRaj1992 */
