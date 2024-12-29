import java.io.*;
import java.util.*;

public class Solution {
  
    public static boolean isCycleExist(List<List<Integer>> adj, int indegree[], int n) {
      int cnt = 0;
      
      Queue<Integer> q = new LinkedList<>();
      
      for(int i=0;i<n;i++) {
        if (indegree[i] == 0) {
          q.add(i);
        }
      }
      
      while(q.size() > 0) {
        int node = q.remove();
        cnt++;
        
        for(int nbr:adj.get(node)) {
          indegree[nbr]--;
          if (indegree[nbr] == 0) {
            q.add(nbr);
          }
        }
      }
      
      if (cnt == n) return false;
      return true;
      
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
      
      int indegree[] = new int[n];
      
      for(int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        
        adj.get(u).add(v);
        
        indegree[v]++;
      }
      
      System.out.println(isCycleExist(adj,indegree,n));
      
      
    }
}
