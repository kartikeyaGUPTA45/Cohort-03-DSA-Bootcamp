import java.io.*;
import java.util.*;

public class Solution {

    public static void kFrequentCharacters(String str, int k) {
      int freq[] = new int[26];
      
      for(int i=0;i<str.length();i++) {
        char ch = str.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
          freq[ch-'a']++;
        } else if (ch >= 'A' && ch<='Z') {
          freq[ch-'A']++;
        }
      }
      
      for(int i=0;i<k;i++) {
        int maxFreq = Integer.MIN_VALUE;
        char ans = 'a';
        int ind = -1;
        
        for(int j=0;j<26;j++) {
          if (maxFreq < freq[j]) {
            maxFreq = freq[j];
            ans = (char)(j+'a');
            ind = j;
          }
        }
        
        System.out.print(ans + " ");
        freq[ind] = 0;
        
      }
    }
  
  
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      String str = scn.nextLine();
      int k = scn.nextInt();
      
      kFrequentCharacters(str,k);
    }
}
