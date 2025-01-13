package January;

import java.util.*;

public class container_water {

     public int maxWater(int arr[]) {
          int l = 0, r = arr.length - 1, maz = 0;

          while (l < r) {
               int h = Math.min(arr[l], arr[r]);
               int w = r - l;
               int ca = h * w;

               maz = Math.max(maz, ca);

               if (arr[l] <= arr[r]) {
                    l++;
               } else {
                    r--;
               }
          }

          return maz;
     }

     public static void main(String[] args) {

     }
}