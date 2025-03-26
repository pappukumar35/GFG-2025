package March;

public class word {
     public boolean wordBreak(String s, String[] dictionary) {
          // code here
          int n = s.length();
          HashSet<String> set = new HashSet<>(Arrays.asList(dictionary));
          boolean[] dp = new boolean[n + 1];
          dp[0] = true;
          int maxWordLength = 0;
          for (String word : dictionary) {
               maxWordLength = Math.max(maxWordLength, word.length());
          }
          for (int i = 1; i <= n; i++) {
               for (int j = Math.max(i - maxWordLength, 0); j < i; j++) {
                    if (dp[j] && set.contains(s.substring(j, i))) {
                         dp[i] = true;
                         break;
                    }
               }
          }
          return dp[n];
     }

     public static void main(String[] args) {

     }
}