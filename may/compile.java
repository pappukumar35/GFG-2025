package may;

public class compile {
     static int longestSubarray(int[] arr, int k) {
          // Code Here
          int n = arr.length;
          HashMap<Integer, Integer> map = new HashMap<>();
          int prefix[] = new int[n];
          int ans = 0;

          for (int i = 0; i < n; i++) {
               int prev = i > 0 ? prefix[i - 1] : 0;

               prefix[i] += prev;
               prefix[i] += arr[i] > k ? 1 : -1;

               int curSum = prefix[i];
               if (curSum > 0)
                    ans = Math.max(ans, i + 1);
               int required = curSum - 1;
               if (map.containsKey(required)) {
                    int startInd = map.get(required);
                    ans = Math.max(ans, i - startInd);
               }

               if (!map.containsKey(prefix[i])) {
                    map.put(prefix[i], i);
               }

          }

          return ans;
     }

     public static void main(String[] args) {

     }
}