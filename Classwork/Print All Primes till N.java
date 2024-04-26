import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for(int i=low;i<=high;i++) {
            int count = 0;
            for(int j = 1;j<=i;j++) {
                if (i%j == 0) count++;
            }

            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}
