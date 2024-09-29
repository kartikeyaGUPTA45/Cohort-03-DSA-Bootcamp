import java.io.*;
import java.util.*;

public class Solution {
  
    public static String[] fizzBarBaz(int n) {
      String arr[] = new String[n+1];
      for(int i=1;i<=n;i++) {
        if (i%3 == 0 && i%5 == 0) {
          arr[i] = "FizzBuzz";
        } else if (i%3 == 0) {
          arr[i] = "Fizz";
        } else if (i%5 == 0) {
          arr[i] = "Buzz";
        } else {
          arr[i] = i+"";
        }
      }
      
      return arr;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      String ans[] = fizzBarBaz(n);
      
      for(int i=1;i<=n;i++) {
        System.out.println(ans[i]);
      }
    }
}
