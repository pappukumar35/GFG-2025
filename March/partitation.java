package March;

public class partitation {
     public int maxPartitions(String s) {
          // code here
          int fre[] = new int[26];
          for (int i = 0; i < s.length(); i++) {
               char ch = s.charAt(i);
               fre[ch - 'a'] = i; // stores the last index always
          }

          int start = 0;
          int end = 0;
          int ans = 0;
          while (start < s.length()) {
               end = Math.max(end, fre[s.charAt(start) - 'a']);
               if (start == end)
                    ans++;

               start++;
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}