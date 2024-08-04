import java.io.*;
import java.util.*;

public class Solution {
  
    public static void pattern(int row, int n) {
      if (row == n) {
        return;
      }
      
      int val = 1;
      for(int j=0;j<=row;j++) {
        System.out.print(val);
        val = val*(row-j)/(j+1);
      }
      
      System.out.println();
      pattern(row+1,n);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      pattern(0,n);
    }
}
