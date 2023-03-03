import java.util.*;

public class BitwisePalindrome {
    public static void main(String[] args) {
        int n = 503;
        int temp = n;
        int rev = 0;
        while (n > 0) {
            rev = rev << 1;
            if ((n & 1) == 1) {
                rev = rev ^ 1;
            }
            n = n >> 1;
        }
        if (temp == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}