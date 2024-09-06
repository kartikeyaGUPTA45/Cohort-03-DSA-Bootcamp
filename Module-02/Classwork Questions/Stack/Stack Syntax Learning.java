import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      
      
      Stack<Integer> s = new Stack<>();
      
      int t = scn.nextInt();
      
      while (t>0) {
        int x = scn.nextInt();
        
        if (x == 1) {
          System.out.println(s.size());
        } else if (x == 2) {
          if (s.size() == 0) {
            System.out.println(-1);
          } else {
            s.pop();
          }
        } else if (x == 3) {
          int ele = scn.nextInt();
          s.push(ele);
        } else if (x == 4) {
          if (s.size() == 0) {
            System.out.println(-1);
          } else {
            System.out.println(s.peek());
          }
        }
        
        t--;
      }
      
    }
}
