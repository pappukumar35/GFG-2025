package March;

public class coin2 {
     public int minCoins(int coins[], int sum) {
          // code here
          int[] dp = new int[sum + 1];
          Arrays.fill(dp, sum + 1);
          int n = coins.length;
          dp[0] = 0;
          for (int num : coins) {
               for (int j = num; j <= sum; j++) {
                    dp[j] = Math.min(dp[j], 1 + dp[j - num]);
               }
          }

          return dp[sum] == sum + 1 ? -1 : dp[sum];
     }

     public static void main(String[] args) {

     }
}