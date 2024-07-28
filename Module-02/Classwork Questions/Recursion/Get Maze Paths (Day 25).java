import java.io.*;
import java.util.*;

public class Solution {
  
    public static List<String> getMazePaths(int sr, int sc, int dr, int dc) {
      
      if (sr > dr || sc > dc) {
        return new ArrayList<>();
      }
      
      if (sr == dr && sc == dc) {
        List<String> base = new ArrayList<>();
        base.add("");
        return base;
      }
      
      List<String> hans = getMazePaths(sr,sc+1,dr,dc);
      List<String> vans = getMazePaths(sr+1,sc,dr,dc);
      
      List<String> ans = new ArrayList<>();
      
      for(int i=0;i<hans.size();i++) {
        ans.add("h" + hans.get(i));
      }
      
      for(int i=0;i<vans.size();i++) {
        ans.add("v" + vans.get(i));
      }
      
      return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      
      System.out.println(getMazePaths(0,0,n-1,m-1));
    }
}
