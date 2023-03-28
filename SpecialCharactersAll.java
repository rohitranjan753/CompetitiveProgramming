
// Move special chracters to the beginning
import java.util.*;

class SpecialCharactersAll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entering SpecialCharacters");
        String str = sc.nextLine();

        String SpecialCharacters = "";
        String normalChar = "";

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))
                    && !Character.isLetter(str.charAt(i))
                    && !Character.isWhitespace(str.charAt(i))) {
                normalChar = normalChar + str.charAt(i);
            } else {
                SpecialCharacters = SpecialCharacters + str.charAt(i);
            }
        }
        String finalStr = SpecialCharacters + normalChar;
        System.out.println("finalStr " + finalStr);

    }
}