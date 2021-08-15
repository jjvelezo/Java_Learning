import java.util.Scanner;
 
class Main {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String str = sc.next();
char[] chars = new char[str.length()];
int i = 0;
for (int j = 0; j < str.length(); j++) {
    char c = str.charAt(j);
    if (Character.isDigit(c)) {
        chars[i++] = c;
        if (j != chars.length - 1)
            continue;
    }
    if (chars[0] == '\0')
        continue;
    String num = new String(chars).trim();
    System.out.println(num);
    chars = new char[str.length()];
    i = 0;
}
 }
 }
