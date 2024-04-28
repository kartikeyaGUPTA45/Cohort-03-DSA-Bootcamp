import java.io.*;
import java.util.*;

public class Solution {
    public static void pattern(int n) {
      int nst = (n/2)+1, nsp = 1;
      
      for(int i=1;i<=n;i++) {
        for(int j=1;j<=nst;j++) {
          System.out.print("*");
        }
        
        for(int j=1;j<=nsp;j++) {
          System.out.print(" ");
        }
        
        for(int j=1;j<=nst;j++) {
          System.out.print("*");
        }
        
        if (i<=n/2) {
          nst--;
          nsp+=2;
        } else {
          nst++;
          nsp-=2;
        }
        
        System.out.println();
      }
    }
    
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      pattern(n);
      
    }
}
