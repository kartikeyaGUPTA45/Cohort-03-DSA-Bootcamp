import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int marks = scn.nextInt();

        if (marks < 33) {
            marks += 4;
        }

        System.out.println(marks);
    }
}
