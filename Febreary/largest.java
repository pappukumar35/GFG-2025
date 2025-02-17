package Febreary;

import java.util.*;

public class largest {
     public ArrayList<Integer> KLargest(int[] arr, int k) {
          ArrayList<Integer> solution = new ArrayList<>();
          int n = arr.length;
          int i = n - 1;
          while (k > 0) {
               solution.add(arr[i]);
               i--;
               k--;
          }
          return solution;
     }

     public static void main(String[] args) {
          int[] arr = { 2, 3, 5, 4 };
     }
}