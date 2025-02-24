package Febreary;

import java.util.ArrayList;

public class stock {
     public ArrayList<Integer> calculateSpan(int[] arr) {
          // write code here
          ArrayList<Integer> arr1 = new ArrayList<>();

          int span = 0;
          for (int i = 0; i < arr.length; i++) {
               for (int j = i; j >= 0; j--) {
                    if (arr[j] <= arr[i]) {
                         span++;
                    } else {
                         break;
                    }
               }
               arr1.add(span);
               span = 0;
          }
          return arr1;
     }

     public static void main(String[] args) {

     }
}