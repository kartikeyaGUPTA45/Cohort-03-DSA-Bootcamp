import java.io.*;
import java.util.*;

public class Solution {
   public static int secondMax(int arr[], int n) {
     int firstMax = -2147483648, secondMax = -2147483648;
     
     if (n<=1) {
       return -2147483648;
     }
     
     int count = 1;
     int ele = arr[0];
     for(int i=1; i<n;i++) {
       if(ele == arr[i]) count++;
     }
     
     if (count == n) {
       return -2147483648;
     }
     
     for(int i=0;i<n;i++) {
       if(arr[i] > firstMax) {
         secondMax = firstMax;
         firstMax = arr[i];
       } else if (secondMax < arr[i] && arr[i] != firstMax) {
         secondMax = arr[i];
       }
     }
     
     return secondMax;
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int arr[] = new int[n];
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      System.out.println(secondMax(arr,n));
    }
}
