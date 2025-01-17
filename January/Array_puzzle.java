package January;

import java.util.*;

public class Array_puzzle {
     public static int[] productExceptSelf(int arr[]) {
          // code here
          int n = arr.length;
          int left[] = new int[n];
          int right[] = new int[n];
          int res[] = new int[n];
          left[0] = arr[0];
          right[n - 1] = arr[n - 1];
          for (int i = 1; i < n - 1; i++) {
               left[i] = left[i - 1] * arr[i];
               right[n - i - 1] = right[n - i] * arr[n - i - 1];
          }
          res[0] = right[1];
          res[n - 1] = left[n - 2];
          for (int i = 1; i < n - 1; i++) {
               res[i] = left[i - 1] * right[i + 1];
          }
          return res;
     }

     public static void main(String[] args) {

     }
}