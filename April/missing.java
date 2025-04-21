package April;

public class missing {
     int missingNum(int arr[]) {
          int n = arr.length + 1;
          int xor1 = 0;
          int xor2 = 0;

          for (int i = 0; i < n - 1; i++) {
               xor1 ^= arr[i];
          }

          for (int i = 1; i <= n; i++) {
               xor2 ^= i;
          }

          return xor1 ^ xor2;
     }

     public static void main(String[] args) {

     }
}