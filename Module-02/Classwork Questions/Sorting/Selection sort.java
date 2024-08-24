import java.io.*;
import java.util.*;

public class Solution {
  
    public static void selectionSort(int arr[], int n) {
      for(int i=0;i<n;i++) {
        int minIdx = i;
        int j = i+1;
        
        while(j<n) {
          if (arr[j] < arr[minIdx]) {
            minIdx = j;
          }
          j++;
        }
        
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
      }
      
      for(int i=0;i<n;i++) {
        System.out.print(arr[i] + " ");
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
      
      selectionSort(arr, n);
    }
}
