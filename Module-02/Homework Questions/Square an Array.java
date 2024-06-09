import java.io.*;
import java.util.*;

public class Solution {
    public static void printSquare(int arr[], int n){
      for(int i=0;i<n;i++) {
        arr[i]= arr[i]*arr[i];
      }
      
      for(int i=0;i<n;i++) {
        System.out.print(arr[i] + " ");
      }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
      }
      
      printSquare(arr, n);
    }
}
