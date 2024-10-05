import java.io.*;
import java.util.*;



public class Solution {
  
    public static class Node {
      int data;
      Node left;
      Node right;

      Node (int data) {
        this.data = data;
      }
    }
  
    public static void inOT(Node node) {
      if (node == null) {
        return;
      }
      
      inOT(node.left);
      System.out.print(node.data + " ");
      inOT(node.right);
    }
  
    public static void pOT(Node node) {
      if (node  == null) {
        return;
      }
      
      System.out.print(node.data + " ");
      pOT(node.left);
      pOT(node.right);
    }
  
    public static void postOT(Node node) {
      if (node == null) {
        return;
      }
      
      postOT(node.left);
      postOT(node.right);
      System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      // Creating the nodes
      Node a = new Node(10);
      Node b = new Node(20);
      Node c = new Node(30);
      Node d = new Node(40);
      Node e = new Node(50);
      Node f = new Node(60);
      Node g = new Node(70);
      Node h = new Node(80);
      
      
      // Connecting the nodes 
      a.left = b;
      a.right = c;
      
      b.left = d;
      
      c.left = e;
      c.right = f;
      
      f.right = h;
      
      d.right = g;
      
      System.out.println("PreOrder Traversal: ") ;
      pOT(a);
      System.out.println();
      System.out.println("InOrder Traversal: ");
      inOT(a);
      System.out.println();
      System.out.println("PostOrder Traversal: ");
      postOT(a);
      
    }
}
