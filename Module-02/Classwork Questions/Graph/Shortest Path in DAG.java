import java.io.*;
import java.util.*;

public class Solution {
    public static class Pair {
      int v;
      int wt;
      
      public Pair(int v, int wt) {
        this.v = v;
        this.wt = wt;
      }
    }
  
    public static void dfs(int node, int vis[], List<List<Pair>> adj, Stack<Integer> st) {
      vis[node] = 1;
      
      for(Pair nbr: adj.get(node)) {
        if (vis[nbr.v] == 0) {
          dfs(nbr.v,vis,adj,st);
        }
      }
      
      st.push(node);
    }
  
    public static int [] shortestPath(List<List<Pair>> adj, int n) {
      Stack<Integer> st = new Stack<>();
      int vis[] = new int [n];
      
      dfs(0,vis,adj,st);
      
      int dis[] = new int[n];
      Arrays.fill(dis, Integer.MAX_VALUE); 
      
      dis[0] = 0;
      
      while(st.size() > 0) {
        int node = st.pop();
        
        for(Pair nbr : adj.get(node)) {
          int v = nbr.v;
          int wt = nbr.wt;
          
          if (dis[v] > dis[node] + wt) {
            dis[v] = dis[node] + wt;
          }
        }
      }
      
      for(int i=0;i<n;i++) {
        if (dis[i] == Integer.MAX_VALUE) {
          dis[i] = -1;
        }
      }
      
      return dis;
    }

    public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      
      List<List<Pair>> adj = new ArrayList<>();
      
      for(int i=0;i<n;i++) {
        adj.add(new ArrayList<>());
      }
      
      for(int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        int wt = scn.nextInt();
        
        adj.get(u).add(new Pair(v,wt));
      }
      
      int ans [] = shortestPath(adj,n);
      
      for(int i=0;i<n;i++) {
        System.out.print(ans[i] + " ");
      }
    }
}
