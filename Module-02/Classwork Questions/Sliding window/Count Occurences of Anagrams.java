Problem Link: https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1

class Solution {

    int search(String pat, String txt) {
        // code here
        
        if (pat.length() > txt.length()) return 0;
        int ans = 0;
        int freq[] = new int[26];
        int tempFreq[] = new int[26];
        
        for(int i=0;i<pat.length();i++) {
            freq[pat.charAt(i)-'a']++;
            tempFreq[txt.charAt(i)-'a']++;
        }
        
        if (Arrays.equals(freq,tempFreq)) {
            ans++;
        }
        
        int i = pat.length();
        int j = 0;
        
        while(i<txt.length()) {
            tempFreq[txt.charAt(j)-'a']--;
            tempFreq[txt.charAt(i)-'a']++;
            
            if (Arrays.equals(tempFreq,freq)) {
                ans++;
            }
            
            i++;
            j++;
        }
        
        return ans;
        
    }
}
