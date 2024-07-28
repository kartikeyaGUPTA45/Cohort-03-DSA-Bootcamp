import java.io.*;
import java.util.*;

public class Solution {
   public static List<String> getPaths(int n) {
     
     // negative base case 
     if (n<0) {
       List<String> base1 = new ArrayList<>();
       return base1;
     }
     
     // positive base case
     if (n == 0) {
       List<String> base2 = new ArrayList<>();
       base2.add("");
       return base2;
     }
     
     
     List<String> oneStep = getPaths(n-1);
     List<String> twoSteps = getPaths(n-2);
     List<String> threeSteps = getPaths(n-3);
     
     List<String> ans = new ArrayList<>();
     
     for(int i=0;i<oneStep.size();i++) {
       ans.add("1" + oneStep.get(i));
     }
     
     for(int i=0;i<twoSteps.size();i++) {
       ans.add("2" + twoSteps.get(i));
     }
     
     for(int i=0;i<threeSteps.size();i++) {
       ans.add("3" + threeSteps.get(i));
     }
     
     return ans;
   }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      System.out.println(getPaths(n));
    }
}
