import java.io.*;
import java.util.*;

public class Solution {
     
      public static int sortByPivot(int arr[], int low, int high, int pivot) {
        
        int i = low, j=low;
        while(i<=high) {
          if (arr[i] <= pivot) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j++;
          } else {
            i++;
          }
        }
        
        return j-1;
        
      }
    
    public static void quickSort(int arr[], int low, int high) {
      if (low > high) {
        return;
      }
      
      int pivot = arr[high];
      int pindx = sortByPivot(arr, low, high, pivot);
      
      quickSort(arr, low, pindx-1);
      quickSort(arr, pindx+1, high);
      
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      quickSort(arr,0,n-1);
      
      for(int i =0;i<n;i++) {
        System.out.print(arr[i] + " ");
      }
    }
}
