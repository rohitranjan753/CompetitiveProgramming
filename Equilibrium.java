// EQUILIBRIUM
// jquery plugin introduction tutorial in hindi/URDU

import java.util.*;

class Equilibrium {

    static void EquilibriumIndex(int array[]) {
        boolean flag = false;
        int sum = 0;
        int leftArraySum = 0;
        int i = 0;
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (i = 0; i < array.length; i++) {
            sum -= array[i];

            if (leftArraySum == sum) {
                flag = true;
                break;
            } else {
                leftArraySum += array[i];
            }
        }
        if (flag) {
            System.out.println("Equilibrium Index: " + i);
        } else {
            System.out.println("No Equilibrium Index");

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of element");
        int num = scanner.nextInt();
        int array[] = new int[num];
        System.out.println("Enter the element");
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        EquilibriumIndex(array);
    }
}