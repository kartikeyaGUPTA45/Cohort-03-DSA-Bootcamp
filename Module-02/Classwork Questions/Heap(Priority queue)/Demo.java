import java.io.*;
import java.util.*;

public class Solution {
    public static void minPQ() {
      PriorityQueue<Integer> pq = new PriorityQueue<>(); // min Heap
      
      pq.add(10);
      pq.add(20);
      pq.add(30);
      pq.add(2);
      pq.add(-1);
      pq.add(3);
      
      
      System.out.println("Size of the PQ: " + pq.size());
      
      System.out.println("Top Element: " + pq.peek());
      
      while (pq.size() > 0) {
        System.out.println(pq.poll());
      }
      
    }
  
    public static void maxPQ() {
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max Heap
      
      pq.add(10);
      pq.add(20);
      pq.add(30);
      pq.add(2);
      pq.add(-1);
      pq.add(3);
      
      
      System.out.println("Size of the PQ: " + pq.size());
      
      System.out.println("Top Element: " + pq.peek());
      
      while (pq.size() > 0) {
        System.out.println(pq.poll());
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      // minPQ();
      maxPQ();
      
    }
}
