import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static int uniqueElements(int arr[], int n) {
      int count = 1, i= 1,j=0;
      
      while(i<n) {
        if (arr[i] != arr[j]) {
          count+=1;
          j=i;
        }
        i++;
      }
      
      return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      System.out.println(uniqueElements(arr, n));
    }
}
