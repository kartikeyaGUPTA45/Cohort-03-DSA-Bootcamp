import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a > 100) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
