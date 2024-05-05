import java.util.*;
public class Main {
    public static int sum (int x, int y) {
        return x+y;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();

        System.out.println(sum(x,y));
    }
}
