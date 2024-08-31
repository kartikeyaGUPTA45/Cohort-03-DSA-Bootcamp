import java.io.*;
import java.util.*;

public class Solution {
   public static void sort012(int arr[], int n) {
     int i=0,j=0,k=n-1;
     
     while(i<=k) {
       if (arr[i] == 0) {
         int temp =arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         
         i++;
         j++;
       } else if (arr[i] == 1) {
         i++;
       } else {
         int temp =arr[i];
         arr[i] =arr[k];
         arr[k] = temp;
         k--;
       }
     }
     
     for(i=0;i<n;i++) {
       System.out.print(arr[i] + " ");
     }
     
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int [n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      sort012(arr,n);
    }
}
