import java.io.*;
import java.util.*;

public class Solution {
    public static void bfs(List<Integer> adj[],  int n) {
      int vis[] = new int[n];
      vis[0] = 1;
      Queue<Integer> q = new LinkedList<>();
      q.add(0);
      
      while(q.size() > 0) {
        int node = q.poll();
        
        System.out.print(node + " ");
        
        for(int i=0;i<adj[node].size();i++) {
          int nbr = adj[node].get(i);
          if (vis[nbr] == 0) {
            vis[nbr] = 1;
            q.add(nbr);
          }
        }
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      
      List<Integer> adj[] = new ArrayList[n];
      
      for(int i=0;i<n;i++) {
        adj[i] = new ArrayList<>();
      }  
      
      for(int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        
        adj[u].add(v);
        adj[v].add(u);
      }
      
      bfs(adj,n);
    }
}
