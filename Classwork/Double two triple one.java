import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int one = scn.nextInt();
        int two = scn.nextInt();
        int three = scn.nextInt();
        int four = scn.nextInt();

        one = one*2;
        two = two*2;
        three = three*3;
        four = four+4;

        int ans = one + two + three + four;

        System.out.println(ans);
    }
}
