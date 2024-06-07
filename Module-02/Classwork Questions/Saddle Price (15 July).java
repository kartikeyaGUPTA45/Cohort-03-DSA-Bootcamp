import java.io.*;
import java.util.*;

public class Solution {
    public static String saddlePrice(int arr[][], int n) {
      for(int i=0;i<n;i++) {
        int min = arr[i][0];
        int col = 0;
        
        for(int k = 1;k<n;k++) {
          if(min > arr[i][k]) {
            min = arr[i][k];
            col = k;
          }
        }
        
        boolean flag = true;
        
        for(int k=0;k<n;k++) {
          if(min < arr[k][col]) {
            flag = false;
            break;
          }
        }
        
        if (flag == true) {
          return min + "";
        }
      }
      
      return "Invalid input";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int arr[][] = new int [n][n];
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      
      System.out.println(saddlePrice(arr,n));
    }
}
