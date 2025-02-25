package Febreary;

import java.util.Stack;

public class stack_stock {
     public static int getMaxArea(int arr[]) {
          // your code here
          Stack<Integer> s = new Stack<>();
          int n = arr.length;
          int ans = 0;

          for (int i = 0; i <= n; i++) {
               int c = (i == n) ? 0 : arr[i];

               while (!s.isEmpty() && c < arr[s.peek()]) {
                    int h = arr[s.pop()];
                    int w = (s.isEmpty()) ? i : (i - s.peek() - 1);
                    ans = Math.max(ans, h * w);
               }
               s.push(i);
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}