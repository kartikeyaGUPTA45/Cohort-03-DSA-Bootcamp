import java.io.*;
import java.util.*;

public class Solution {
   public static int countD(int n, int d) {
     int count = 0;
     while(n>0) {
       int rem = n%10;
       int quo = n/10;
       
       if (rem == d) count++;
       n = quo;
     }
     
     return count;
   }
    
    public static void voidCountD(int n, int d) {
      int count = 0;
     while(n>0) {
       int rem = n%10;
       int quo = n/10;
       
       if (rem == d) count++;
       n = quo;
     }
      System.out.println(count);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int d = scn.nextInt();
      
      // System.out.println(countD(n,d));
      voidCountD(n,d);
    }
}
