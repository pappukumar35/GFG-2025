package January;

import java.util.*;

public class every_window {

     public static void main(String[] args) {

          ArrayList<Integer> ans = new ArrayList<>();
          for (int i = 0; i <= arr.length - k; i++) {
               HashSet<Integer> hs = new HashSet<>();
               for (int j = i; j < k + i; j++) {
                    hs.add(arr[j]);
               }
               ans.add(hs.size());
          }
          return ans;

     }
}