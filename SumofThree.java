
// Sum of three variable
import java.util.*;

class SumofThree {
    public static void main(String[] args) {
        int firstVar = 0, secondVar = 0, thirdVar = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first variable");
        firstVar = scanner.nextInt();
        System.out.println("Enter second variable");
        secondVar = scanner.nextInt();
        System.out.println("Enter third variable");
        thirdVar = scanner.nextInt();
        System.out.println(firstVar + secondVar + thirdVar);
    }
}