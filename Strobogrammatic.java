import java.util.*;

class Strobogrammatic{

    static char rotate(char ch){
        switch (ch) {
            case '6':
               return 9;
            case '9':
               return 6;
            default:
                return ch;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String numVal = String.valueOf(num);
        if(numVal.length() == 1){
            if(numVal.contains("0") || numVal.contains("1") ||numVal.contains("8")){
                System.out.println("Its a Strobogrammatic no");
            }
            else{
                System.out.println("Its not a Strobogrammatic no");
            }
        }
        else{
            if(numVal.contains("0") || numVal.contains("1") || numVal.contains("8") || numVal.contains("6") || numVal.contains("9")){

            }
            else{
                if(numVal.contains("2") || numVal.contains("3") || numVal.contains("4") || numVal.contains("5") || numVal.contains("7")){
                    System.out.println("Its not a Strobogrammatic no");
                }
                else{
                    StringBuffer s1 = new StringBuffer(numVal);
                    s1.reverse();
                    String s2 = s1.toString();
                    for(int i=0;i<numVal.length();i++){
                        s2 = s2+rotate(s1.charAt(i));
                        if(numVal == s2){
                            System.out.println("Its a Strobogrammatic no");
                        }
                        else{
                            System.out.println("Its not a Strobogrammatic no");
                        }
                    }
                }
            }
        }
    }
}