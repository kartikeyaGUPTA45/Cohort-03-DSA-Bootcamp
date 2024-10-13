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

    Stack<Pair> st = new Stack<>();
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
   
    public static int height(Node root) {
      if (root == null) return -1;
      
      int lt = height(root.left);
      int rt = height(root.right);
      
      return Math.max(lt,rt) + 1; 
    }  
  
    public static int diameterOfBinaryTree(Node root) {
        if (root == null) {
          return 0;
        }
      
      int ld = diameterOfBinaryTree(root.left);
      int rd = diameterOfBinaryTree(root.right);
      
      int h1 = height(root.left);
      int h2 = height(root.right);
      
      int d = h1 + h2 + 2;
      
      return Math.max(d,Math.max(ld,rd));
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

      Node root = construct(arr);
      System.out.println(diameterOfBinaryTree(root));
    }

}
