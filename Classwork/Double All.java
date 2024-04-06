import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int one = scn.nextInt();
        int two = scn.nextInt();
        int three = scn.nextInt();
        int four = scn.nextInt();
        int five = scn.nextInt();

        one = one*2;
        two = two*2;
        three = three*2;
        four = four*2;
        five = five*2;

        int ans  = one + two + three + four + five;

        System.out.println(ans);
    }
}
