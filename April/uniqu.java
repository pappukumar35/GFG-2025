package April;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class uniqu {
     public int[] singleNum(int[] arr) {
          // Code here
          int n = arr.length;
          Map<Integer, Integer> map = new HashMap<>();
          ArrayList<Integer> ans = new ArrayList<>();

          for (int num : arr) {
               map.put(num, map.getOrDefault(num, 0) + 1);
          }

          for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
               if (entry.getValue() == 1)
                    ans.add(entry.getKey());
          }

          Collections.sort(ans);

          int res[] = new int[ans.size()];

          for (int i = 0; i < ans.size(); i++) {
               res[i] = ans.get(i);
          }

          return res;
     }

     public static void main(String[] args) {

     }
}