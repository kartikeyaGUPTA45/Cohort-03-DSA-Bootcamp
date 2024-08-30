import java.io.*;
import java.util.*;

public class Solution {
  
    public static void insertionSort(int arr[], int n) {
      for(int i=1;i<n;i++) {
        for(int j=i-1;j>=0;j--) {
          if (arr[j] > arr[j+1]) {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          } else {
            break;
          }
        }
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
      
      insertionSort(arr,n);
        
    }
}
