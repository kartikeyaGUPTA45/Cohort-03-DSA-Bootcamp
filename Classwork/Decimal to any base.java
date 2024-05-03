import java.io.*;
import java.util.*;

public class Solution {
   public static int dtob(int n, int b) {
      int answer = 0, power = 1;
      while(n>0) {
        int rem = n%b;
        int quo = n/b;
        answer += (rem*power);
        power *=10;
        n = quo;
      }
     return answer;
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      System.out.println(dtob(n,b));
    }
}
