import java.io.*;
import java.util.*;

public class Solution {
  
    public static class Pair{
      int nbr;
      int wt;
      
      public Pair(int nbr, int wt) {
        this.nbr = nbr;
        this.wt = wt;
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      
      List<List<Pair>>adj = new ArrayList<>();
      
      for(int i=0;i<n;i++) {
        adj.add(new ArrayList<>());
      }
      
      for(int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        int wt = scn.nextInt();
        
        adj.get(u).add(new Pair(v,wt));
        adj.get(v).add(new Pair(u,wt));
      }
      
      
      for(int i=0;i<n;i++) {
        System.out.print(i + " -> {");
        for(int j=0;j<adj.get(i).size();j++) {
          System.out.print("(" + adj.get(i).get(j).nbr + "," + adj.get(i).get(j).wt + ")");
        }
        System.out.println("}");
      }
      
      
    }
}
