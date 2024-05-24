import java.io.*;
import java.util.*;

public class Solution {
   public static int countDigits(int n) {
     int ans = 0;
     while(n>0) {
       n/=10;
       ans++;
     }
     
     return ans;
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner  scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int ans = countDigits(n);
      System.out.println(ans);
    }
}
