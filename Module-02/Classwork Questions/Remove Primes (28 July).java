import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPrime(int n) {
      int count = 0;
      for(int i=1;i<=n;i++) {
        if (n%i == 0) {
          count++;
        }
      }
      
      if (count == 2) {
        return true;
      } else {
        return false;
      }
    }
  
    public static void removePrimes(ArrayList<Integer> arr) {
      for(int i=arr.size()-1;i>=0;i--) {
        int num = arr.get(i);
        if (isPrime(num)) {
          arr.remove(i);
        }
      }
      
      System.out.println(arr);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      ArrayList<Integer> arr = new ArrayList<>();
      
      for(int i=0;i<n;i++) {
        int x = scn.nextInt();
        arr.add(x);
      }
      
      removePrimes(arr);

    }
}
