// Using while loop 
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int count = 0;
      
        while (n > 0) {
          n/=10;
          count++;
          
        }
      
        System.out.println(count);
    }
}


// Using for loop 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int count = 0;
      for(int i=n;i>0;i/=10) {
        count++;
      }
      
        System.out.println(count);
    }
}
