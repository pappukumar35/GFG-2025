package may;

public class cole {
     static int noOfWays(int m, int n, int x) {
          // code here
          int[][] dp = new int[n + 1][x + 1];
          dp[0][0] = 1;
          for (int dice = 1; dice <= n; dice++) {
               for (int sum = 1; sum <= x; sum++) {
                    for (int face = 1; face <= m; face++) {
                         if (sum - face >= 0) {
                              dp[dice][sum] = (dp[dice][sum] + dp[dice - 1][sum - face]);
                         }
                    }
               }
          }
          return dp[n][x];
     }

     public static void main(String[] args) {

     }
}