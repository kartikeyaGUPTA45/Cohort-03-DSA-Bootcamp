import java.util.*;
public class Main {
    public static void fizzBuzz(int n) {
        if (n%3 == 0) {
            System.out.print("Fizz");
        }

        if (n%7 == 0) {
            System.out.print("Buzz");
        }

        if (n%3 != 0 && n%7 != 0) {
            System.out.println(n);
        }


    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        fizzBuzz(n);
    }
}
