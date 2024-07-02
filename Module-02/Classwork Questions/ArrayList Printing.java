import java.io.*;
import java.util.*;

public class Solution {
   public static void printArrayList(ArrayList<Integer> arr) {
     for(int i=0;i<arr.size();i++) {
       System.out.print(arr.get(i) + " ");
     }
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      ArrayList<Integer> arr = new ArrayList<>();
      
      for(int i=0;i<n;i++) {
        int x = scn.nextInt();
        arr.add(x);
      }
      
      printArrayList(arr);
    }
}
