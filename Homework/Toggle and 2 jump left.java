import java.util.*;
public class Main {
    public static void toggleAndJump(char ch) {
        if (ch>='a' && ch <= 'z') {
            ch = (char)(ch-'a' + 'A');
            if (ch == 'A' || ch == 'B') {
                System.out.println("Sorry");
            } else {
                ch-=2;
                System.out.println(ch);
            }

        } else if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch-'A'+'a');
            if (ch == 'a' || ch == 'b') {
                System.out.println("Sorry");
            } else {
                ch-=2;
                System.out.println(ch);
            }

        } else {
            System.out.println("No alphabet");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);

        toggleAndJump(ch);
    }
}
