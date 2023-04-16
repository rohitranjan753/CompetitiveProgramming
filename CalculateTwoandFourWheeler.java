import java.util.*;

class CalculateTwoandFourWheeler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vehicle count: ");
        int vehicleCount = scanner.nextInt();
        System.out.println("Enter wheelCount: ");
        int wheelCount = scanner.nextInt();
        float res = ((4 * vehicleCount) - wheelCount) / 2;
        if (wheelCount >= 2 && (wheelCount % 2 == 0) && vehicleCount < wheelCount) {
            System.out.println("TW = " + (int) (res) + "FW= " + (int) (vehicleCount - res));
        } else {
            System.out.println("Invalid Input");
        }
    }
}