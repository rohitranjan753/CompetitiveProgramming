
// Move special chracters to the beginning
import java.util.*;

class SpecialCharactersAll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entering SpecialCharacters");
        String str = sc.nextLine();

        String SpecialCharacters = "";
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
        System.out.println("finalStr " + finalStr);

    }
}