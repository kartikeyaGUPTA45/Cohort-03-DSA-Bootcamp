import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int nsp = n/2, nst = 1;
      
      for(int i=1;i<=n;i++) {
        for(int j=1;j<=nsp;j++) {
          System.out.print(" ");
        }
        
        for(int j=1;j<=nst;j++) {
          System.out.print("*");
        }
        
        if (i<=n/2) {
          nsp--;
          nst+=2;
        } else {
          nsp++;
          nst-=2;
        }
        System.out.println();
      }
    }
}
