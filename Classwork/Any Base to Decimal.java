import java.io.*;
import java.util.*;

public class Solution {
   public static int btod(int n, int b) {
     int answer = 0, power = 1;
     while(n>0) {
       int rem = n%10;
       int q = n/10;
       answer = answer + rem*power;
       power = power*b;
       n = q;
     }
     
     return answer;
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      
      System.out.println(btod(n,b));
    }
}
