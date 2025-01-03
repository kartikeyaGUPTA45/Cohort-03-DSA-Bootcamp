import java.io.*;
import java.util.*;

public class Solution {
  
    public static int [] fsd(List<List<Integer>> adj, int n, int src) {
      int dis[]= new int[n];
      
      // for(int i=0;i<n;i++) {
      //   dis[i] = Integer.MAX_VALUE;
      // }
      
      Arrays.fill(dis, Integer.MAX_VALUE);
      
      dis[src] = 0;
      
      Queue<Integer> q = new LinkedList<>();
      q.add(src);
      
      while(q.size() > 0) {
        int node = q.remove();
        
        for(int nbr:adj.get(node)) {
          if (dis[nbr] > dis[node] + 1) {
            dis[nbr] = dis[node] + 1;
            q.add(nbr);
          }
        }
      }
      
      return dis;
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
      
      int src = scn.nextInt();
      
      int dis [] = fsd(adj,n,src);
      
      for(int i=0;i<n;i++) {
        System.out.print(dis[i] + " ");
      }
    }
}
