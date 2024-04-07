import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        int w = scn.nextInt();

        if (x*y == z*w) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
