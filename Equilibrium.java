// EQUILIBRIUM
// jquery plugin introduction tutorial in hindi/URDU

import java.util.*;

class Equilibrium {

    static void EquilibriumIndex(int array[]) {

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