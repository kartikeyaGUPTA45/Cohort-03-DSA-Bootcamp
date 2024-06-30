import java.io.*;
import java.util.*;

public class Solution {
   public static int searchCharacter(char arr[], int n, char x) {
      int low = 0,high = n-1;
     while(low<=high) {
       int mid = (low+high)/2;
       
       char searchChar = arr[mid];
       
       if (x == searchChar) {
         return mid;
       } else if(x < searchChar) {
         high = mid-1;
       } else {
         low = mid+1;
       }
     }
     
     return -1;
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      Scanner scn = new Scanner(System.in);
      char ch = scn.next().charAt(0);
      int n = scn.nextInt();
      
      char arr[] = new char[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.next().charAt(0);
      }
      
      if (searchCharacter(arr,n,ch) != -1) {
        ch++;
        System.out.println(ch);
      } else {
        System.out.println(-1);
      }
    }
}
