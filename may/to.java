package may;

public class to {
     public int findMaximum(int[] arr) {
          // code here
          int n = arr.length;
          if (n == 1) {
               return arr[0];
          }
          if (arr[0] > arr[1]) {
               return arr[0];
          }
          if (arr[n - 2] < arr[n - 1]) {
               return arr[n - 1];
          }
          int left = 1;
          int right = n - 2;
          while (left <= right) {
               int mid = left + (right - left) / 2;
               if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return arr[mid];
               } else if (arr[mid] < arr[mid + 1]) {
                    left = mid + 1;
               } else {
                    right = mid - 1;
               }
          }
          return -1;
     }

     public static void main(String[] args) {

     }
}