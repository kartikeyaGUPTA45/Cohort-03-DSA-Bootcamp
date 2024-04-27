import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int nsp=0,nst = n;
      
      for(int i=1;i<=n;i++) {
        for(int j=1;j<=nsp;j++) {
          System.out.print("\t");
        }
        
        for(int j=1;j<=nst;j++) {
          System.out.print("*\t");
        }
        
        nsp++;
        nst--;
        System.out.println();
        
      }
    }
}
