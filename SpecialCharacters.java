
// Move special chracters to the beginning
import java.util.*;

class SpecialCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char chArr[] = str.toCharArray();
        System.out.println(chArr);
        String hypenChar = "";
        String normalChar = "";

        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == '-') {
                hypenChar = hypenChar + chArr[i];
                chArr[i] = ' ';
            } else {
                normalChar = normalChar + chArr[i];
            }
        }
        String finalStr = hypenChar + normalChar;

    }
}