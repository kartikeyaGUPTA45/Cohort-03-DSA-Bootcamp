import java.io.*;
import java.util.*;

public class Solution {
  
  
    public static int findElement(int a[], int d) {
      for(int i=0;i<a.length;i++) {
        if (a[i] == d) {
          return i;
        }
      }
      
      return -1;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int a[] = new int[n];
      for(int i=0;i<n;i++) {
        a[i] = scn.nextInt();
      }
      
      int d = scn.nextInt();
      
      System.out.println(findElement(a,d));
      
    }
}
