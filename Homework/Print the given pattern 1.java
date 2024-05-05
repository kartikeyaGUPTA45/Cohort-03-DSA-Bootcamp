import java.util.*;
public class Main {
    public static void pattern(int n) {
     int nsp = 0, nst = n;
     for(int i=1;i<=n;i++) {
       for(int j=1;j<=nsp;j++) {
         System.out.print(" ");
       }
       for(int j=1;j<=nst;j++) {
         System.out.print(". ");
       }
       nst--;
       nsp++;
       
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
