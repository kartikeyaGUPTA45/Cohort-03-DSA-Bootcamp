import java.io.*;
import java.util.*;

public class Solution {
  
    public static void mergeTwoArrays(int a[], int n, int b[], int m) {
      int res [] = new int [n+m];
      int i=0,j=0,k=0;
      
      while(i<n && j<m) {
        if (a[i] > b[j]) {
          res[k] = b[j];
          j++;
        } else {
          res[k] = a[i];
          i++;
        }
        
        k++;
      }
      
      
      while(i<n) {
        res[k] = a[i];
        i++;
        k++;
      }
      
      while(j<m) {
        res[k] = b[j];
        j++;
        k++;
      }
      
      
      i=0;
      while(i<res.length) {
        System.out.println(res[i]);
        i++;
      }
      
      
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int  n =scn.nextInt();
      int a[] = new int[n];
      
      for(int i=0;i<n;i++) {
        a[i] = scn.nextInt();
      }
      
      
      int m = scn.nextInt();
      int b[] = new int[m];
      
      for(int i=0;i<m;i++) {
        b[i] = scn.nextInt();
      }
      
      
      mergeTwoArrays(a,n,b,m);
    }
  
}
