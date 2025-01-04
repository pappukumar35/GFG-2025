package January;

public class Sum_Sorted_Array {
     public int countTriplets(int[] arr, int target) {
          int n = arr.length;
          int cnt = 0;

          for (int i = 0; i < n - 2; i++) {
               int low = i + 1, high = n - 1;
               while (low < high) {
                    int sum = arr[i] + arr[low] + arr[high];
                    if (sum == target) {
                         cnt++;

                         int tempLow = low + 1;
                         int tempHigh = high - 1;

                         while (tempLow < high && arr[tempLow] == arr[low]) {
                              cnt++;
                              tempLow++;
                         }
                         while (tempHigh > low && arr[tempHigh] == arr[high]) {
                              cnt++;
                              tempHigh--;
                         }

                         low++;
                         high--;
                    } else if (sum < target) {
                         low++;
                    } else {
                         high--;
                    }
               }
          }

          return cnt;
     }

     public static void main(String[] args) {

     }
}