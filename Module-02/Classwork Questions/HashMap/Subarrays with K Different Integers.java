import java.io.*;
import java.util.*;

public class Solution {
  
    public static int atmost(int arr[], int n, int k) {
      int i=0,res = 0;
      HashMap<Integer,Integer> map =new HashMap<>();
      
      for(int j=0;j<n;j++) {
        if (map.getOrDefault(arr[j],0) == 0) k--;
        map.put(arr[j], map.getOrDefault(arr[j],0)+1);
        
        while(k<0) {
          map.put(arr[i], map.get(arr[i])-1);
          if (map.get(arr[i]) == 0) {
            k++;
          }
          
          i++;
        }
        
        res += (j-i+1);
      }
      return res;
      
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
      
      System.out.println(atmost(arr,n,k) - atmost(arr,n,k-1));
    }
}
