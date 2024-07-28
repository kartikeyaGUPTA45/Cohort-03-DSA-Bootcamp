import java.io.*;
import java.util.*;

public class Solution {
    public static int firstIdx(int arr[], int x, int n, int idx) {
      if (idx == n) {
        return -1;
      }
      
      if (arr[idx] == x) {
        return idx;
      } else {
        return firstIdx(arr,x,n,idx+1);
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      int x = scn.nextInt();
      
      System.out.println(firstIdx(arr,x,n,0));
    }
}
