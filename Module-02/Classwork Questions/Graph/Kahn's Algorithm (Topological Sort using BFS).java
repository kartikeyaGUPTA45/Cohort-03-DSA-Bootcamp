import java.io.*;
import java.util.*;

public class Solution {
  
    public static void topoSort(List<List<Integer>> adj, int indegree[], int n) {
      Queue<Integer> q = new LinkedList<>();
      
      for(int i=0;i<n;i++) {
        if (indegree[i] == 0) {
          q.add(i);
        }
      }
      
      
      while(q.size() > 0) {
        int node = q.remove();
        System.out.print(node + " ");
        
        for(int nbr: adj.get(node)) {
          indegree[nbr]--;
          
          if (indegree[nbr] == 0) {
            q.add(nbr);
          }
        }
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
      
      int indegree[] = new int[V];
      
      for(int i=0;i<E;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        
        adj.get(u).add(v);
        indegree[v]++;
      }
      
      topoSort(adj,indegree,V);
    }
}
