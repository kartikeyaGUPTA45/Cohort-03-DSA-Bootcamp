import java.io.*;
import java.util.*;

public class Solution {
    public static int anyBaseAddition(int b, int n1, int n2) {
      int answer = 0, power = 1, carry = 0;
      
      while(n1>0 || n2 > 0 || carry > 0) {
        int d1 = n1%10;
        int d2 = n2%10;
        
        int sum = d1+d2+carry;
        
        answer = answer + (sum%b)*power;
        carry = sum/b;
        
        n1 = n1/10;
        n2 = n2/10;
        power = power*10;
      }
      
      return answer;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int  b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
      
      System.out.println(anyBaseAddition(b,n1,n2));
    }
}
