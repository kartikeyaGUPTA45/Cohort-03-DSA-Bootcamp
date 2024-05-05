Problem Statement: Given a number N, count how many numbers are there in the range 1, N (both include) whose sum of digits is even.

Input format:
A single integer N
  
Output format
Count the numbers


Solution: 
public static int digitSum(int num) {
    int sum = 0;
    while(num > 0) {
      sum += (num%10);
      num/=10;
    }
    return sum;
  }
  
  public static int FindSum(int num) {
    int ans = 0;
    for(int i=1;i<=num;i++) {
      if(digitSum(i)%2 == 0) ans++;
    }

    return ans;
   
  }
