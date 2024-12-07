import java.io.*;
import java.util.*;

public class Solution {
    
    public static void kSortedArray(int arr[], int n, int k) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      
      for(int i=0;i<=k;i++) {
        pq.add(arr[i]);
      }
      
      for(int i=k+1;i<n;i++) {
        System.out.println(pq.poll());
        pq.add(arr[i]);
      }
      
      
      while(pq.size() > 0) {
        System.out.println(pq.poll());
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
      
      int k = scn.nextInt();
      
      kSortedArray(arr,n,k);
        
    }
}
