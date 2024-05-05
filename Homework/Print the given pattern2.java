import java.util.*;
public class Main {
    public static void pattern(int n) {
      int row = 2*n-1;
      int nst = 1;
      
      for(int i=1;i<=row;i++) {
        for(int j=1;j<=nst;j++) {
          System.out.print(". ");
        }
        if (i <= (n-1)) nst++;
        else nst--;
        System.out.println();
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      pattern(n);
    }
}
