import java.io.*;
import java.util.*;

public class Solution {
  
    public static List<String> groupAnagrams(String[] strs, int n) {
      HashMap<String, List<String>> map = new HashMap<>();
      
      for(int i=0;i<n;i++) {
        String str = strs[i];
        char ch[] = str.toCharArray();
        
        Arrays.sort(ch);
        str = String.valueOf(ch);
        
        if (map.containsKey(str)) {
          List<String> value = map.get(str);
          value.add(strs[i]);
        } else {
          List<String> value = new ArrayList<>();
          value.add(strs[i]);
          map.put(str, value);
        }
      }
      
      List<String> ans = new ArrayList<>();
      for(String key: map.keySet()) {
        ans.addAll(map.get(key));
      }
      
      return ans;
      
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      String strs [] = new String[n];
      
      for(int i=0;i<n;i++) {
        strs[i] = scn.next();
      }
      
      List<String> ans = groupAnagrams(strs,n);
      Collections.sort(ans);
      
      System.out.println(ans);
    }
}
