import java.io.*;
import java.util.*;

public class Solution {
    public static int countPalindromicRows(int arr[][], int m, int n) {
      int count = 0;
      for(int row = 0;row<m;row++) {
        int left = 0, right = n-1;
        int flag = 0;
        while(left<right) {
          if (arr[row][left] != arr[row][right]){
            flag =1;
            break;
          }
          left++;
          right--;
        }
        
        if (flag == 0) {
          count++;
        }
      }
      
      return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int m = scn.nextInt();
      int n = scn.nextInt();
      
      int arr[][] = new int[m][n];
      for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      
      System.out.println(countPalindromicRows(arr,m,n));
    }
}
