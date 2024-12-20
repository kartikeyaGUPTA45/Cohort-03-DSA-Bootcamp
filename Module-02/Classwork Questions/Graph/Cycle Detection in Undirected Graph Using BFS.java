import java.io.*;
import java.util.*;

public class Solution {
  
    public static class Pair {
      int node;
      int parent; 
      
      public Pair(int node, int parent) {
        this.node = node;
        this.parent = parent;
      }
    }
  
    public static boolean bfs(int node, List<List<Integer>> adj, int vis[]) {
      vis[node] = 1;
      Queue<Pair> q = new LinkedList<>();
      q.add(new Pair(node, -1));
      
      while(q.size() > 0) {
        Pair p = q.remove();
        
        for(int nbr:adj.get(p.node)) {
          if (vis[nbr] == 0) {
            vis[nbr] = 1;
            q.add(new Pair(nbr,p.node));
          } else if (p.parent != nbr) {
            return true;
          }
        }
      }
      
      return false;
    
    }
  
    public static boolean isCyclePresent(List<List<Integer>> adj, int n) {
      int vis[] = new int[n];
      
      for(int i=0;i<n;i++) { // Components
        if(vis[i] == 0) {
          if (bfs(i,adj,vis) == true) {
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
