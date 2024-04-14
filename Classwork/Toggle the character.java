import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char ch = scn.nextLine().charAt(0);

        if (ch >= 'a' && ch<='z') {
            ch =(char)(ch-'a'+'A');
        } else {
            ch = (char)(ch-'A'+'a');
        }

        System.out.println(ch);
    }
}
