package March;

public class decoding {
     public int countWays(String digits) {
          int n = digits.length();
          if (n == 0 || digits.charAt(0) == '0')
               return 0;

          int[] dp = new int[n + 1];
          dp[0] = 1; // Base case: Empty string
          dp[1] = 1; // Single character can be decoded only one way (if not '0')

          for (int i = 2; i <= n; i++) {
               int oneDigit = digits.charAt(i - 1) - '0'; // Last digit
               int twoDigits = Integer.parseInt(digits.substring(i - 2, i)); // Last two digits

               // If single digit is valid (1-9), it contributes to dp[i]
               if (oneDigit >= 1) {
                    dp[i] += dp[i - 1];
               }

               // If two-digit number is valid (10-26), it contributes to dp[i]
               if (twoDigits >= 10 && twoDigits <= 26) {
                    dp[i] += dp[i - 2];
               }
          }

          return dp[n];
     }

     public static void main(String[] args) {

     }
}