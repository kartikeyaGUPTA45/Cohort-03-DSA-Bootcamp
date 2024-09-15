import java.io.*;
import java.util.*;

public class Solution {
  
    public static int timeTaken(int arr[], int n, int k) {
      int time = 0;
      Queue<Integer> q = new LinkedList<>();
      
      for(int i=0;i<n;i++) {
        q.add(i);
      }
      
      while(q.size() > 0) {
        int index  = q.poll();
        arr[index]--;
        time++;
        
        
        if (arr[index] == 0 && index == k) return time;
        
        if (arr[index] != 0) q.add(index);
      }
      
      return time;
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
      
      System.out.println(timeTaken(arr,n,k));
    }
}
