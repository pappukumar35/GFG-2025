package January;

import java.util.*;

public class Possible_Triangle {
     // Function to count the number of possible triangles.
     static int countTriangles(int arr[]) {
          // code here
          Arrays.sort(arr);
          int count = 0;
          for (int k = arr.length - 1; k >= 2; k--) {
               int st = 0;
               int ed = k - 1;
               while (ed > st) {
                    int sum = arr[st] + arr[ed];
                    if (sum > arr[k]) {
                         count += ed - st;
                         ed--;
                    } else {
                         st++;
                    }
               }
          }
          return count;
     }

     public static void main(String[] args) {

     }
}