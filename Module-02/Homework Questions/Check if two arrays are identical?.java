import java.io.*;
import java.util.*;

public class Solution {
  
    public static boolean equalArrays(int a1[], int a2[], int n1, int n2) {
      if (n1 != n2) {
        return false;
      }
      
      for(int i=0;i<n1;i++) {
        if (a1[i] != a2[i]) return false;
      }
      
      return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int a1 [] = new int[n1];
      
      for(int i=0;i<n1;i++) {
        a1[i] = scn.nextInt();
      }
      
      int n2 = scn.nextInt();
      int a2[] = new int[n2];
      
      for(int i=0;i<n2;i++) {
        a2[i] = scn.nextInt();
      }
      
      System.out.println(equalArrays(a1,a2,n1,n2));
    }
}
