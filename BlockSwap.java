// array block swap

import java.util.*;

class BlockSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int num = scanner.nextInt();
        int array[] = new int[num];
        System.out.println("Enter the element");
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the index to swap");
        int index = scanner.nextInt();
        int temp = 0;
        int i, j;
        for (i = 0; i < index; i++) {
            temp = array[i];
            for (j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[j] = temp;
        }

        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}