
// Sum of digits
import java.util.*;

class SumofDigits {
    public static void main(String[] args) {
        int firstVar = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter variable");
        try {
            firstVar = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Inavlid input error: " + e.getMessage());
        }
        int n = firstVar;
        String s = String.valueOf(firstVar);

        if (s.length() == 7) {
            while (n > 0) {
                int temp = n % 10;
                sum = sum + temp;
                n = n / 10;
            }
            System.out.println("Sum of digit is " + sum);
        }
    }
}
