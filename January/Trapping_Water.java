package January;

import java.util.*;

public class Trapping_Water {
     public int maxWater(int arr[]) {
          int n = arr.length;
          int lm[] = new int[n];
          int rm[] = new int[n];
          lm[0] = arr[0];
          rm[n - 1] = arr[n - 1];
          for (int i = 1; i < n; i++) {
               lm[i] = Math.max(arr[i], lm[i - 1]);
          }
          for (int i = n - 2; i >= 0; i--) {
               rm[i] = Math.max(arr[i], rm[i + 1]);
          }
          int water = 0;
          for (int i = 0; i < n; i++) {
               water += Math.min(lm[i], rm[i]) - arr[i];
          }
          return water;
     }

     public static void main(String args[]) {

     }
}