package January;

import java.util.HashMap;

public class Subarrays_with_sum_K {
     public int countSubarrays(int arr[], int k) {
          int count = 0;

          HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
          int arrSum = 0;
          map.put(0, 1);
          for (int num : arr) {
               arrSum += num;
               if (map.containsKey(arrSum - k)) {
                    count += map.get(arrSum - k);
               }
               map.put(arrSum, map.getOrDefault(arrSum, 0) + 1);
          }
          return count;
     }

     public static void main(String[] args) {

     }
}