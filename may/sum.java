package may;
public class sum{
      public static int sumSubstrings(String s) {
        int n = s.length();
        long sum = 0;
        long prev = 0;
        int mod = 1000000007;

        for (int i = 0; i < n; i++) {
            int num = s.charAt(i) - '0';
            prev = (prev * 10 + (long)(num) * (i + 1)) % mod;
            sum = (sum + prev) % mod;
        }
        return (int) sum;
    }
     public static void main(String[] args) {
          
     }
}