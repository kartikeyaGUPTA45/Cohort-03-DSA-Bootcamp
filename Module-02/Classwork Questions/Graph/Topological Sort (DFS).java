import java.io.*;
import java.util.*;

public class Solution {
   
    public static void dfs(int node, List<List<Integer>> adj, int vis[], Stack<Integer> st) {
      vis[node] = 1;
      
      for(int nbr:adj.get(node)) {
        if (vis[nbr] == 0) {
          dfs(nbr,adj,vis,st);
        }
      }
      
      st.push(node);
    }
  
    public static void topologicalSort(List<List<Integer>> adj, int n) {
      int vis[] = new int[n];
      Stack<Integer> st = new Stack<>();
      
      for(int i=0;i<n;i++) {
        if (vis[i] == 0) {
          dfs(i,adj,vis,st);
        }
      }
      
      while(st.size() > 0) {
        System.out.print(st.pop() + " ");
      }
      
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
      
      topologicalSort(adj,V);
    }
}
