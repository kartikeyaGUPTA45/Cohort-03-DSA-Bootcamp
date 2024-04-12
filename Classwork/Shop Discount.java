import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int units = scn.nextInt();

        int totalCost = units*100;

        if (totalCost > 1000) {
            totalCost = totalCost - (int)(totalCost*0.1);
        }

        System.out.println(totalCost);
    }
}
