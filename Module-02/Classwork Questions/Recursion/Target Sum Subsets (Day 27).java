import java.io.*;
import java.util.*;

public class Solution {
    public static void tss(int arr[], int idx, int sof, int tar, String ans) {
        if (sof > tar) {
          return;    
        }
      
        if (idx == arr.length) {
          if (tar == sof) {
            System.out.println(ans + ".");
          }
          return;
        }
      
       tss(arr,idx+1,sof + arr[idx], tar, ans + arr[idx] + ", ");
       tss(arr,idx+1,sof,tar,ans);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      int tar = scn.nextInt();
      
      tss(arr,0,0,tar,"");
    }
}
