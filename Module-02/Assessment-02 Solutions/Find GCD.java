Problem Statement:
Find GCD
Take an integer input of number n.
Prepare another number m using the following rules
a) Double the value of n
b) Add 5 to it
c) Multiply by 6
d) Subtract 9 from it

Calculate the GCD of (n,m)

Input Format
Integer

Constraints
1 <= n <= 10 ^ 3

Output Format
Integer

Examples
Input: 5
Output: 1
Input: 12
Output: 3

Solution: 

public static int FindGCD(int n) {
    int m = n*2; // => 10
    m+=5; // m = m+5; => 15
    m*=6; // m = m*6; => 90
    m-=9; // m = m-9; => 81 

    // find GCD(n,m);
    while(n%m != 0) {
      int rem = n%m;
      n = m;
      m = rem;
    }

    return m;
  }
