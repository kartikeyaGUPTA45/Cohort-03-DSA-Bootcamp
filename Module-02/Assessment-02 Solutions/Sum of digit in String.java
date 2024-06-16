Problem Statement:
Sum of digit in String
Take as input String. Write a program to find the Sum of Digits in a String.

Example(To be used only for expected output):
Input: 23456789
output 44

Input Format
A string representing S.

Constraints
The size of the String may be large.

Output Format
print the sum of digits

Examples
Input: "23456789"
Output: 44
Input: "11111"
Output: 5

Solution:
public static int SumofdigitinString(String str) {
    // str = "23456789" => 2+3+4+5+6+7+8+9 = 44
    int ans = 0;
    for(int i=0;i<str.length(); i++) {
      // Ways to convert character to integer
      //int num = Character.getNumericValue(str.charAt(i));
      // String s = str.charAt(i);
      // int num = Integer.parseInt(s); // Integer.parseInt() => works on String
      // int num1 = Intger.parseInt(str.charAt(i) + "");
      // int num2 = Integer.parseInt(String.valueOf(str.charAt(i)));

      int num = str.charAt(i)-'0';
      ans += num;

    }

    return ans;
  }
