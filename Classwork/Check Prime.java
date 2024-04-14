import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++) {
            if (n%i == 0) {
                count+=1;
            }
        }

        if (count == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
