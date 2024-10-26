import java.io.*;

import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack< Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " -> " + node.data + " <- ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
  
    
  public static Node helper(int [] inOrder, int low, int high) {
    if (low > high) {
      return null;
    }
    
    int mid = (low+high)/2;
    Node node = new Node(inOrder[mid], null, null);
    node.left = helper(inOrder, low, mid-1);
    node.right = helper(inOrder, mid+1, high);
    
    return node;
  }
        
  public static Node constructFromInOrder(int[] inOrder) {  
    int n = inOrder.length;
    
    return helper(inOrder, 0, n-1);
  }
  
  
  public static void main(String[] args) throws Exception {
    Scanner scn=new Scanner(System.in);
    int n = scn.nextInt();
    int[] in = new int[n];
    for (int i = 0; i < n; i++)
        in[i] = scn.nextInt();

    Node root = constructFromInOrder(in);
    display(root);  
  }

}
