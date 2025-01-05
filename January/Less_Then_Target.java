package January;

import java.util.*;

public class Less_Then_Target {
     int countPairs(int arr[], int target) {
          // Your code here
          Arrays.sort(arr);
          int count = 0;
          int st = 0;
          int ed = arr.length - 1;
          while (st < ed) {
               if ((arr[st] + arr[ed]) < target) {
                    count += ed - st;
                    st++;
               } else {
                    ed--;
               }
          }
          return count;
     }

     public static void main(String[] args) {

     }
}