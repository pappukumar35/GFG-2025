package January;

import java.util.*;
import java.util.HashMap;

public class Largest_SubArray {
     public int maxLen(int[] arr) {
          int ans = 0;
          int cntOne = 0;
          int n = arr.length;
          HashMap<Integer, Integer> map = new HashMap<>();
          map.put(0, -1);
          for (int i = 0; i < n; i++) {
               if (arr[i] == 1)
                    cntOne++;
               else
                    cntOne--;

               if (map.containsKey(cntOne))
                    ans = Math.max(ans, i - map.get(cntOne));
               else
                    map.put(cntOne, i);

          }

          return ans;
     }

     public static void main(String[] args) {

     }
}