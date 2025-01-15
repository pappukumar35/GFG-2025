package January;

import java.util.*;

public class Longest_SubArray {
     public int longestSubarray(int arr[], int k) {
          int n = arr.length;
          int sum = 0;
          int maxLength = 0;
          int len = 0;
          HashMap<Integer, Integer> map = new HashMap<>();
          map.put(0, -1);
          for (int i = 0; i < n; i++) {
               sum += arr[i];
               if (map.containsKey(sum - k)) {
                    len = i - map.get(sum - k);
                    maxLength = Math.max(len, maxLength);
               }
               if (!map.containsKey(sum)) {
                    map.put(sum, i);
               }
          }
          return maxLength;
     }

     public static void main(String[] args) {

     }
}