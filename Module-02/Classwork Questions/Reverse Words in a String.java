import java.io.*;
import java.util.*;

public class Solution {
  
    public static String removeExtraSpace(String str) {
      String ans = "";
      
      for(int i=0;i<str.length();i++) {
        char ch = str.charAt(i);
        if (ch == ' ') {
          if (ans.length() > 0 && ans.charAt(ans.length()-1) != ' ') {
            ans += " ";
          } 
        } else {
          ans+=ch;
        }
      }
      
      return ans;
    }
  
    public static String reverseTheWords(String str) {
      String updatedString = removeExtraSpace(str);
      
      String arr[] = updatedString.split(" ");
      String ans = "";
      
      for(int i=arr.length-1;i>=0;i--) {
        ans += (arr[i] + " ");
      }
      
      return ans;
      
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      
      System.out.println(reverseTheWords(str));
    }
}
