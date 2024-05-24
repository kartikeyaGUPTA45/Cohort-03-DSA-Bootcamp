import java.io.*;
import java.util.*;

public class Solution {
  
    public static int findFrequency(int n, int d) {
      int ans = 0;
      while(n>0) {
        int rem = n%10;
        if (rem == d) ans++;
        n/=10;
      }
      
      return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int d = scn.nextInt();
      
      System.out.println(findFrequency(n,d));
    }
}
