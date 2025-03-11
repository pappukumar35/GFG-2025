package March;

public class stay {
     int countWays(int n) {
          // your code here
          int dp[] = new int[n + 1];
          dp[0] = 1;
          for (int i = 1; i <= n; i++) {
               dp[i] += dp[i - 1];
               if (i > 1)
                    dp[i] += dp[i - 2];
          }
          return dp[n];
     }

     public static void main(String[] args) {

     }
}