package April;

public class xor {
     public int maxXor(int[] arr) {
          // code here
          int x = 0;
          for (int i = 0; i < arr.length - 1; i++) {
               for (int j = i + 1; j < arr.length; j++) {
                    int o = arr[i] ^ arr[j];
                    x = Math.max(x, o);
               }
          }
          return x;
     }

     public static void main(String[] args) {

     }
}