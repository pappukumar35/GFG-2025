package Febreary;

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class show_window {
     public ArrayList<Integer> maxOfMins(int[] arr) {
          int n = arr.length;
          int[] mins = new int[n];
          Arrays.fill(mins, 1);

          Stack<Integer> stack = new Stack<>();

          for (int i = 0; i < n; i++) {
               while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                    int pop = stack.pop();
                    mins[pop] += i - pop - 1;
               }

               if (!stack.isEmpty()) {
                    mins[i] += i - stack.peek() - 1;
               } else {
                    mins[i] += i;
               }

               stack.push(i);
          }

          int tail = stack.pop();
          while (!stack.isEmpty()) {
               int pop = stack.pop();
               mins[pop] += tail - pop;
          }

          int[] res = new int[n];

          for (int i = 0; i < n; i++) {
               res[mins[i] - 1] = Math.max(res[mins[i] - 1], arr[i]);
          }

          int maxi = 0;
          for (int i = n - 1; i >= 0; i--) {
               maxi = Math.max(maxi, res[i]);
               res[i] = maxi;
          }

          ArrayList<Integer> result = new ArrayList<>();
          for (int value : res) {
               result.add(value);
          }

          return result;
     }

     public static void main(String[] args) {

     }
}