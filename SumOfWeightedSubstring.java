// Sum of Weighted Substring
// 1. Pos = 'a' - 'a'
// Pos mapped with Q
// Take out the position character, convert to integer
// Sum of String <=K true->print(substring)
// false    break;

import java.util.*;

class SumOfWeightedSubstring {
    static void weightedSubstring(String stringValue, int K, String Q) {
        // char string[] = stringValue.toCharArray();
        String result = "";
        for (int i = 0; i < stringValue.length(); i++) {
            int sum = 0;
            String s = "";
            for (int j = i; j < stringValue.length(); j++) {
                int currentPos = stringValue.charAt(j) - 'a';
                sum += Q.charAt(currentPos) - '0';
                s += stringValue.charAt(j);

                if (sum <= K) {
                    result = s;
                } else {
                    break;
                }
            }
        }
        System.out.println("Length of Wieghted Subarray is:" + result.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString = sc.next();
        int K = sc.nextInt();
        String Q = "12345678912345678912345678";
        weightedSubstring(originalString, K, Q);

    }
}