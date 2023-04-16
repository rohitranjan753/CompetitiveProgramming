
// count * and # 
import java.util.*;

class Countstarandhas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int hashCount = 0, starCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                hashCount++;
            } else {
                starCount++;
            }
        }
        if (hashCount == starCount) {
            System.out.println("0");
        } else if (hashCount > starCount) {
            System.out.println("-1");
        } else {
            System.out.println("1");
        }
    }
}