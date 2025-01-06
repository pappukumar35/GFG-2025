package January;

import java.util.*;

public class Sum_Pair_closest_to_target {
     public List<Integer> sumClosest(int[] arr, int target) {
          // code here
          List<Integer> list = new ArrayList<>();
          Arrays.sort(arr);
          int start = 0;
          int end = arr.length - 1;
          int totalmax = Integer.MAX_VALUE;
          int[] ans = new int[2];
          ans[0] = -1;
          ans[1] = -1;
          while (start < end) {
               int total = arr[start] + arr[end];
               int diff = Math.abs(target - total);
               if (totalmax > diff) {
                    totalmax = diff;
                    ans[0] = arr[start];
                    ans[1] = arr[end];

               }
               if (total < target) {
                    start++;
               } else {
                    end--;
               }
          }
          if (ans[0] != -1 && ans[1] != -1) {
               list.add(ans[0]);
               list.add(ans[1]);

          }

          return list;

     }

     public static void main(String[] args) {

     }
}