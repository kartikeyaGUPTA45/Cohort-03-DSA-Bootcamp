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

  public static Node lowestCommonAncestor( Node root,  Node p,  Node q) {
    if (root == null) {
      return null;
    }
    
    if (p == null || q == null) {
      return null;
    }
    
    if (p.data == root.data || q.data == root.data) {
      return root;
    }
    
    if (p.data < root.data && q.data < root.data) {
      return lowestCommonAncestor(root.left, p, q);
    } else if (p.data > root.data && q.data > root.data) {
      return lowestCommonAncestor(root.right, p, q);
    } else {
      return root;
    }
    
  }
  
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    
    Node p = new Node(a, null, null);
    Node q = new Node(b, null, null);

    Node root = construct(arr);
      
    Node rt=lowestCommonAncestor(root,p,q);
     System.out.println(rt.data);
      
  }

}