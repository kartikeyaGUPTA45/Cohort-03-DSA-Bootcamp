import java.io.*;
import java.util.*;

public class Solution {
  
    public static void printCommonElements(int a1[], int a2[], int n1, int n2) {
      HashMap<Integer,Integer> map = new HashMap<>();
      
      for(int i=0;i<n1;i++) {
        map.put(a1[i], map.getOrDefault(a1[i],0)+1);
      }
      
      for(int i=0;i<n2;i++) {
        if(map.containsKey(a2[i])) {
          System.out.println(a2[i]);
          int freq = map.get(a2[i]);
          
          if (freq == 1) {
            map.remove(a2[i]);
          } else {
            map.put(a2[i], freq-1);
          }
        }
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int a1 [] = new int[n1];
      
      for(int i=0;i<n1;i++) {
        a1[i] = scn.nextInt();
      }
      
      int n2 = scn.nextInt();
      int a2 [] = new int[n2];
      
      for(int i=0;i<n2;i++) {
        a2[i] = scn.nextInt();
      }
      
      printCommonElements(a1, a2, n1, n2);
    }
}
