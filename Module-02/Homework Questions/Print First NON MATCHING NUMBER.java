import java.io.*;
import java.util.*;

public class Solution {
  
    public static int firstNonMatchingNumber(int a1[], int a2[], int n) {
        for(int i=0;i<n;i++) {
          if(a1[i] != a2[i]) {
            return i;
          }
        }
      
      return -1;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int a1[] = new int [n];
      for(int i=0;i<n;i++) {
        a1[i] = scn.nextInt();
      }
      
      int a2[] = new int[n];
      
      for(int i=0;i<n;i++) {
        a2[i] = scn.nextInt();
      }
      
      System.out.println(firstNonMatchingNumber(a1,a2,n));
    }
}
