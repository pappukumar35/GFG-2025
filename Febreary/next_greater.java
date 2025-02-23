package Febreary;

import java.util.ArrayList;

public class next_greater {
     public ArrayList<Integer> nextLargerElement(int[] arr) {
          // code here
          ArrayList<Integer> res = new ArrayList<>();
          for (int i = 0; i < arr.length - 1; i++) {
               int j = i + 1;
               while (j < arr.length) {
                    if (arr[j] > arr[i]) {
                         res.add(arr[j]);
                         break;
                    }
                    j++;
               }
               if (j == arr.length)
                    res.add(-1);
          }
          res.add(-1);
          return res;
     }

     public static void main(String[] args) {

     }
}