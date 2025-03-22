package March;

public class stick {
     int maxValue(int[] arr) {
          // code here
          int n = arr.length;
          if (n == 0)
               return 0;
          if (n == 1)
               return arr[0];
          return Math.max(roberry(arr, 0, n - 2), roberry(arr, 1, n - 1));

     }

     public static int roberry(int[] arr, int start, int end) {
          int n = end - start + 1;
          if (n == 0)
               return 0;
          if (n == 1)
               return arr[start];

          int[] dp = new int[n];
          dp[0] = arr[start];
          dp[1] = Math.max(dp[0], arr[start + 1]);
          for (int i = 2; i < n; i++) {
               dp[i] = Math.max(arr[i + start] + dp[i - 2], dp[i - 1]);
          }
          return dp[n - 1];

     }

     public static void main(String[] args) {

     }
}