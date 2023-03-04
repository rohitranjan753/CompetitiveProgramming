import
java.util
public class Strobo {
public static void main(String[] args) {
String n = "9006";
System.out.println
("Is " + n + " is Strobogrammatic? "
+ is_Strobogrammatic (
}
public static
boolean is_Strobogrammatic (String n)
if (n == null ||
n.length () == 0)
return true;
}
HashMap
< Character, Character > map = new
HashMap < Character, Character >
map.put
('0', '
map.put
('1', '
© 2016 SMART Training Resources Pvt. Ltd.
map.put
('8', '
map.put
('6', '
map.put
('9', '
int
left = 0;
int
right = n.length () 1;
while (left <= right) {
if (!
map.containsKey n.charAt (right)) ||
n.charAt (left) != map.get n.charAt (right)))
return false;
}
left++;
right
}
return true;
}
}