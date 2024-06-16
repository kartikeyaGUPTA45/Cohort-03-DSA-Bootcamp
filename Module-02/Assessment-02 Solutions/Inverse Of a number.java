Problem Statement: 
Inverse Of A Number
You are given a number following certain constraints.
The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5-digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273, etc. Here are a few invalid numbers - 139, 7421357, etc.
The inverse of a number is defined as the number created by interchanging the face value (from left to right) and index of digits of number.e.g. for 526134 (reading from left to right, 5 is in place 1, 2 is in place 2, 6 is in place 3, 1 is in place 4, 3 is in place 5 and 4 is in place 6), the inverse will be 425613 (reading from left to right, 4 is in place 1, 2 is in place 2, 5 is in place 3, 6 is in place 4, 1 is in place 5 and 3 is in place 6) More examples - inverse of 2134 is 2134 and inverse of 24153 is 31524.
Take as input the number "n", and assume that the number will follow constraints.
Print its inverse - left to right.

Input Format
"n" where n is any integer, following the constraints defined above.

Constraints
1 <= n < 10^8, and following other constraints defined above.

Output Format
"i", the inverted (left to right) number

Examples
Input: 526134
Output: 425613
Input: 1234
Output: 1234


Solution: 
public static int InverseOfANumber(int num) {
    int count = 0;
    int temp = num;
    while(temp > 0) {
      count++;
      temp/=10;
    }

    int arr[] = new int[count+1];
    for(int i=count;i>=1;i--) {
      int rem = num%10;
      arr[i] = rem;
      num/=10;
    }

    int ans[] = new int[count+1];
    for(int i=1;i<=count;i++) {
      ans[arr[i]] = i;
    }

    int res = 0;
    for(int i=1;i<=count;i++) {
      res = res*10 + ans[i];
    }

    return res;
  
  }
