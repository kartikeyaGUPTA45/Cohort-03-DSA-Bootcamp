import java.io.*;
import java.util.*;

public class Solution {
   public static int btod(int n, int b) {
     int ans = 0, power = 1;
     
     while(n>0) {
       ans += (n%10)*power;
       power *= b;
       n = n/10;
     }
     
     return ans;
   }
  
    public static int dtob(int n, int b) {
      int ans = 0, power = 1;
      
      while(n>0) {
        ans += (n%b)*power;
        n/=b;
        power*=10;
      }
      
      return ans;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b1 = scn.nextInt();
      int b2 = scn.nextInt();
      
      int ans = btod(n,b1);
      System.out.println(dtob(ans,b2));
    }
}
