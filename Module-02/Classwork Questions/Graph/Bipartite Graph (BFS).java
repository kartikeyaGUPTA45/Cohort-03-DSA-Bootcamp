import java.io.*;
import java.util.*;

public class Solution {
  
    public static List<List<Integer>> prepareList(int arr[][], int n) {
      List<List<Integer>> adj = new ArrayList<>();
      for(int i=0;i<n;i++) {
        adj.add(new ArrayList<>());
      }
      
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          if (arr[i][j] == 1) {
            adj.get(i).add(j);
            adj.get(j).add(i);
          }
        }
      }
      
      return adj;
    }
  
    public static boolean bfs(int node, List<List<Integer>> adj, int color[]) {
      color[node] = 0;
      
      Queue<Integer> q = new LinkedList<>();
      q.add(node);
      
      while(q.size() > 0) {
        node = q.remove();
        
        for(int nbr:adj.get(node)) {
          if (color[nbr] == -1) {
            color[nbr] = 1-color[node];
            q.add(nbr);
          } else if (color[nbr] == color[node]) {
            return false;
          }
        }
      }
      
      return true;
    }
  
    public static boolean isBipartiteGraph(List<List<Integer>> adj, int n) {
      int color [] = new int[n];
      
      Arrays.fill(color,-1);
      
      for(int i=0;i<n;i++) {
        if (color[i] == -1) {
          if (bfs(i,adj,color) == false) {
            return false;
          }
        }
      }
      
      return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[][] =  new int[n][n];
      
      for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
          arr[i][j] = scn.nextInt();
        }
      }
      
      List<List<Integer>> adjList = prepareList(arr,n);
      System.out.println(isBipartiteGraph(adjList,n));
    }
}
