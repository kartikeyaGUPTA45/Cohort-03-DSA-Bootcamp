import java.io.*;
import java.util.*;

public class Solution {
  
    public static boolean dfs(int node, List<List<Integer>> adj, int vis[], int parent) {
      vis[node] = 1;
      
      for(int nbr:adj.get(node)) {
        if (vis[nbr] == 0) {
          return dfs(nbr, adj,vis,node);
        } else if (nbr != parent) {
          return true;
        }
      }
      
      return false;
    }
  
    public static boolean isCyclePresent(List<List<Integer>> adj, int n) {
      int vis[] = new int[n];
      
      for(int i=0;i<n;i++) {
        if (vis[i] == 0) {
          if (dfs(i,adj,vis,-1) == true) {
            return true;
          }
        }
      }
      
      return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      
      List<List<Integer>> adj = new ArrayList<>();
      
      for(int i=0;i<n;i++) {
        adj.add(new ArrayList<>());
      }
      
      for(int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        
        adj.get(u).add(v);
        adj.get(v).add(u);
      }
      
      System.out.println(isCyclePresent(adj,n));
    }
}
