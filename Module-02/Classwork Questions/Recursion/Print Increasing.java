import java.io.*;
import java.util.*;

public class Solution {
    public static void pi(int n) {
      if (n == 0) {
        return;
      }
      
      pi(n-1);
      System.out.println(n);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      pi(n);
    }
}
