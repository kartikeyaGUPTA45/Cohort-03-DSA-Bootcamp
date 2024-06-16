Problem Statement: 
You are given a two-digit number. Square each digit and return the number.
For example:
num = 12
digits are 1 and 2
square of 1 = 1
square of 2 = 4

The answer is square(1) square of (2) i.e 14

Input Format
An integer num

Output Format
Return the result after squaring each digit of the number

Examples
Input: 12
Output: 14
Input: 23
Output: 49


Solution -01 (When return type is int) 

public static int DigitSquare(int num) {
    // code goes here  
    // num = 12
    int num1 = num%10; // 2
    num/=10;
    int num2 = num%10; // 1

    num1 = num1 * num1;
    num2 = num2 * num2;

    int ans = num2*10+num1;
    return ans; 
  }


Solution -02 (When return type is String) 
public static String DigitSquare(int num) {
    // code goes here  
    // num = 12
    int num1 = num%10; // 2
    num/=10;
    int num2 = num%10; // 1

    num1 = num1 * num1;
    num2 = num2 * num2;

    return num2 + "" + num1;  
  }
