import java.io.*;
import java.util.*;

class JosephuesTratatic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of people: ");

        int numberofElements = scanner.nextInt();
        System.out.println("Enter Division: ");
        int division = scanner.nextInt();
        System.out.println(Josephus(numberofElements, division));
    }

    public static int Josephus(int numberofElements, int division) {
        division--;
        int arrayofPeople[] = new int[numberofElements];
        for (int i = 0; i < numberofElements; i++) {
            arrayofPeople[i] = 1;
        }
        int cnt = 0, safeIndex = 0, num = 1;
        while (cnt < (numberofElements - 1)) {
            while (num <= division) {
                safeIndex++;
                safeIndex = safeIndex % numberofElements;
                if (arrayofPeople[safeIndex] == 1) {
                    num++;
                }
            }
            num = 1;
            arrayofPeople[safeIndex] = 0;
            cnt++;
            safeIndex++;
            safeIndex = safeIndex % numberofElements;
            while (arrayofPeople[safeIndex] == 0) {
                safeIndex++;
                safeIndex = safeIndex % numberofElements;
            }
        }
        return safeIndex + 1;
    }
}