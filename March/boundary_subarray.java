package March;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class boundary_subarray {
     int last_index;

     public ArrayList<Integer> longestSubarray(int[] arr, int x) {
          // code
          this.last_index = 0;
          int low = 1;
          int high = arr.length;

          while (low < high) {
               int mid = (low + high + 1) / 2;
               if (checkIfExist(arr, x, mid)) { // checking is there exist any window of size "k" with max absolute
                                                // difference upto "x"
                    low = mid;
               } else {
                    high = mid - 1;
               }
          }

          // System.out.println(low + " " + high);
          ArrayList<Integer> A = new ArrayList<>();
          for (int i = this.last_index; i > this.last_index - low && i >= 0; i--) {
               A.add(0, arr[i]);
          }
          return A;
     }

     private boolean checkIfExist(int arr[], int x, int k) {
          Deque<Integer> min_dq = new LinkedList<>();
          Deque<Integer> max_dq = new LinkedList<>();

          for (int i = 0; i < arr.length; i++) {
               while (!min_dq.isEmpty() && arr[i] <= arr[min_dq.peekFirst()]) {
                    min_dq.pollFirst();
               }
               while (!min_dq.isEmpty() && min_dq.peekLast() <= i - k) {
                    min_dq.pollLast();
               }
               min_dq.offerFirst(i); // increasing-order

               while (!max_dq.isEmpty() && arr[i] >= arr[max_dq.peekFirst()]) {
                    max_dq.pollFirst();
               }
               while (!max_dq.isEmpty() && max_dq.peekLast() <= i - k) {
                    max_dq.pollLast();
               }
               max_dq.offerFirst(i); // decreasing-order

               int min = arr[min_dq.peekLast()];
               int max = arr[max_dq.peekLast()];

               if (max - min <= x && i >= k - 1) {
                    this.last_index = i;
                    return true;
               }
          }

          return false;
     }

     public static void main(String[] args) {

     }
}