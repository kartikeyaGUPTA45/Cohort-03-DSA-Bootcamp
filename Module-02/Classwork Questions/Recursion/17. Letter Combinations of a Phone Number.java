class Solution {
    String letters [] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> helper(String digits) {

        if (digits.length() == 0) {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = digits.charAt(0);
        String ros = digits.substring(1);
        List<String> subAns = helper(ros);

        List<String> ans = new ArrayList<>();
        String val = letters[ch-'0'];

        for(int i=0;i<val.length();i++) {
            for(int j=0;j<subAns.size();j++) {
                ans.add(val.charAt(i) + subAns.get(j));
            }
        }

        return ans;

    }


    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        return helper(digits);
    }
}
