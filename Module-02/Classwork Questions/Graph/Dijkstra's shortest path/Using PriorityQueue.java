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
  
    public static class QPair {
      int node;
      int dis;
      
      public QPair(int node, int dis) {
        this.node = node;
        this.dis = dis;
      }
    } 
    
    public static int [] dijkstraAlgo(List<List<Pair>> adj, int n, int src) {
      // Queue<QPair> q = new LinkedList<>();
      PriorityQueue<QPair> q = new PriorityQueue<>(n, Comparator.comparingInt(o -> o.dis));
      int distance[] = new int[n];
      Arrays.fill(distance, Integer.MAX_VALUE);
      
      distance[src] = 0;
      q.add(new QPair(src,0));
      
      while(q.size() > 0) {
        QPair qp = q.remove();
        
        int node = qp.node;
        int dis = qp.dis;
        
        for(Pair p : adj.get(node)) {
          if (distance[p.v] > dis + p.wt) {
            distance[p.v] = dis + p.wt; 
            q.add(new QPair(p.v, distance[p.v]));
          }
        }
      }
      
      return distance;
    }

    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      
      int n = scn.nextInt();
      int m = scn.nextInt();
      int src = scn.nextInt();
      
      List<List<Pair>> adj = new ArrayList<>();
      
      for(int i=0;i<n;i++) {
        adj.add(new ArrayList<>());
      }
      
      for(int i=0;i<m;i++) {
        int u = scn.nextInt();
        int v = scn.nextInt();
        int wt = scn.nextInt();
        
        adj.get(u).add(new Pair(v,wt));
        adj.get(v).add(new Pair(u,wt));
      }
      
      int dis[] = dijkstraAlgo(adj,n,src);
      
      for(int i=0;i<n;i++) {
        System.out.print(dis[i] + " ");
      }
    }
}
