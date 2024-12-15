import java.io.*;
import java.util.*;

public class Solution {
  
    public static void dfs_helper(int node, List<List<Integer>> adj, int vis[]) {
      vis[node] = 1;
      
      System.out.print(node + " ");
      
      for(int nbr:adj.get(node)) {
        if (vis[nbr] == 0) {
          dfs_helper(nbr,adj,vis);
        }
      }
    }
  
    public static void  dfs(List<List<Integer>> adj, int n) {
      int vis[]= new int [n];
      for(int i=0;i<n;i++) { // This is for handling multiple components
        if (vis[i] == 0) {
          dfs_helper(i,adj,vis); 
        }
      }
      
    } 

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int m = scn.nextInt();
      
      List<List<Integer>> adj = new  ArrayList<>();
      
      for(int i=0;i<n;i++) {
        adj.add(new ArrayList<>());
      }
      
      for(int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        
        adj.get(u).add(v);
        adj.get(v).add(u);
      }
      
      dfs(adj,n);
    }
}
