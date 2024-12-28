import java.io.*;
import java.util.*;

public class Solution {
  
    public static boolean dfs(int node, List<List<Integer>>adj, int vis[], int pathVis[]) {
      vis[node] = 1;
      pathVis[node] = 1;
      
      for(int nbr: adj.get(node)) {
        if (vis[nbr] == 0) {
          if (dfs(nbr,adj,vis,pathVis) == true) {
            return true;
          }
        } else if (pathVis[nbr] == 1) {
          return true;
        }
      }
      
      pathVis[node] = 0;
      return false;
    }

    public static boolean detectCycle(List<List<Integer>> adj, int n) {
      int vis[] = new int[n];
      int pathVis[] = new int[n];
      
      for(int i=0;i<n;i++) {
        if (vis[i] == 0) {
          if (dfs(i,adj,vis,pathVis) == true) {
            return true;
          }
        }
      }
      
      return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int V = scn.nextInt();
      int E = scn.nextInt();
      
      List<List<Integer>> adj = new ArrayList<>();
      
      for(int i=0;i<V;i++) {
        adj.add(new ArrayList<>());
      }
      
      for(int i=0;i<E;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        
        adj.get(u).add(v);
      }
      
      System.out.println(detectCycle(adj, V));
        
    }
}
