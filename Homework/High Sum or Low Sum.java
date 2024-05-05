import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long x = scn.nextInt();
        long y = scn.nextInt();

        long sum = x+y;

        if (sum >= 100) {
            System.out.println("High Sum");
        } else {
            System.out.println("Low Sum");
        }
    }
}
