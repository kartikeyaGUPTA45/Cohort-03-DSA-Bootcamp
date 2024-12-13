import java.io.*;
import java.util.*;

public class Solution {

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
        
        adj[u].add(v); // go to u and add v
        adj[v].add(u); // go to v and add u
      }
      
      for(int i=0;i<n;i++) {
        System.out.print(i + " "); // printing node
        // for(int j=0;j<n;j++) { // wrong step/
        for(int j=0;j<adj[i].size();j++) {
          System.out.print(adj[i].get(j) + " "); // printing adjacent nodes
        }
        System.out.println();
      }
       
      
    }
}
