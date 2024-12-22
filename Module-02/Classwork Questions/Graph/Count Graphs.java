import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int edges = (n*(n-1))/2;
      int count = 1;
      for(int i=1;i<=edges;i++) {
        count*=2;
      }
      
      System.out.println(count);
    }
}
