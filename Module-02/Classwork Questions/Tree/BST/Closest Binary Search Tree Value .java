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
  
   public static double diff;
   public static int ans; 
    
   public static void helper(Node root, double target) {
     if (root == null) return;
     
     double tempDiff = Math.abs(Math.abs(root.data) - Math.abs(target));
     
     if (diff > tempDiff) {
       diff = tempDiff;
       ans = root.data;
     }
     
     if (diff == tempDiff) {
       if (ans > root.data) ans = root.data; 
     }
     
     if (root.data > target) {
       helper(root.left, target);
     } else if (root.data < target) {
       helper(root.right, target);
     }
   } 
   
   public static int closestValue( Node root, double target) {
      diff = Double.MAX_VALUE;
      helper(root, target);
      return ans;
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

    double p = Double.parseDouble(br.readLine());

    Node root = construct(arr);
    System.out.println(closestValue(root,p));  
  }

}
