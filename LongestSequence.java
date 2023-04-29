import java.util.*;

class LongestSequence {
    public static void main(String[] args) {
        int prev = 0, curr = 0, max = 0;
        int n = 255;
        while (n > 0) {
            if ((n & 1) == 1) {
                curr++;
            } else if ((n & 1) == 0) {
                if ((n & 2) == 0) {
                    prev = 0;
                    curr = 0;
                } else if ((n & 2) == 1) {
                    prev = curr;
                    curr = 0;
                }
            }
            max = Math.max(prev + curr, max);
            n = n >> 1;
        }
        System.out.println("Max sequence is: " + (max + 1));
    }
}