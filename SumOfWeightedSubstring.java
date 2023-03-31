// Sum of Weighted Substring
// 1. Pos = 'a' - 'a'
// Pos mapped with Q
// Take out the position character, convert to integer
// Sum of String <=K true->print(substring)
// false    break;

import java.util.*;
class SumOfWeightedSubstring{
    static void weightedSubstring(String stringValue, int K, int Q){
        char string[] = stringValue.toCharArray();
        int q[] = Q
        for(int i = 0; i < string.length(); i++){
            int sum=0;
            String s="";
            for(int j = i; j < string.length(); j++){
                    int current = string.charAt(j) - 'a';
                    sum +=Q.charAt(current)-'0';
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString = sc.next();
        int K = sc.nextInt();
        int Q = sc.nextLine();
        weightedSubstring(originalString, K, Q);

    }
}