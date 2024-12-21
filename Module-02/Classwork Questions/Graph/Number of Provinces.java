import java.io.*;
import java.util.*;

public class Solution {
  
   // Using BFS Traversal
    public static void bfs(int node, List<List<Integer>> adj, int vis[]) {
      vis[node] = 1;
      
      Queue<Integer> q = new LinkedList<>();
      q.add(node);
      
      while(q.size() > 0)  {
        node = q.remove();
        
        for(int nbr:adj.get(node)) {
          if (vis[nbr] == 0) {
            vis[nbr]  = 1;
            q.add(nbr);
          }
        }
      }
    }
  
   // Using DFS Traversal
    public static void dfs(int node, List<List<Integer>> adj, int vis[]) {
      vis[node] = 1;
      
      for(int nbr:adj.get(node)) {
        if (vis[nbr] == 0) {
          dfs(nbr,adj,vis);
        }
      }
    }
    
    public static int noOfProvinces(int arr[][], int n) {
      List<List<Integer>> adj = new ArrayList<>();
      
      for(int i=0;i<n;i++) {
        adj.add(new ArrayList<>());
      }
      
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          if (arr[i][j] == 1 && i!=j) {
            adj.get(i).add(j);
            adj.get(j).add(i);
          }
        }
      }
      
      int vis[] = new int[n];
      int count = 0;
      for(int i=0;i<n;i++) {
        if (vis[i] == 0) {
          count++;
          dfs(i,adj,vis);
        }
      }
      
      return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[][] = new int[n][n];
      
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      
      System.out.println(noOfProvinces(arr,n));
    }
}
