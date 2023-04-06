import java.util.*;

class LongestPalindromeSubstring {
    static void LongestPalindrome(char arr[], int n) {
        int count = 0, prev = 0, next = 0, mid = 0, maxcount = 0;
        int start = 0, end = 0;
        for (int i = 1; i < n; i++) {
            mid = i;
            if (arr[mid] == '$') {
                prev = mid - 1;
                next = mid + 1;
                count = 0;
                while (prev >= 0 && next < n) {
                    if (arr[prev] == arr[next]) {
                        count += 2;
                        prev -= 2;
                        next += 2;
                    } else {
                        break;
                    }
                }
            } else {
                prev = mid - 2;
                next = mid + 2;
                count = 1;
                while (prev >= 0 && next < n) {
                    if (arr[prev] == arr[next]) {
                        count += 2;
                        prev -= 2;
                        next += 2;
                    } else {
                        break;
                    }
                }
            }
            if (count > maxcount) { // if the count is not equal to the length of the original string
                maxcount = count;
                start = prev + 2;
                end = next - 2;
            }
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == '$')
                continue;
            System.out.print(arr[i]);
        }
        System.out.println("\ncount is " + maxcount);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // abcbacad
        int n = str.length() * 2 - 1;
        char arr[] = new char[n];
        for (int i = 0, j = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = str.charAt(j);
                j++;
            } else {
                arr[i] = '$';
            }
        }

        // //print array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        LongestPalindrome(arr, n);
    }

}