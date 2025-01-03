package January;

public class Xor {
     public long subarrayXor(int[] arr, int k) {
          // Map to store frequency of XOR prefixes
          Map<Integer, Integer> prefixXorCount = new HashMap<>();
          prefixXorCount.put(0, 1); // Base case for XOR
          long count = 0;
          int xor = 0;

          for (int num : arr) {
               xor ^= num; // Update current XOR
               int target = xor ^ k; // XOR condition for required subarray

               // Add count of subarrays with XOR equal to target
               count += prefixXorCount.getOrDefault(target, 0);

               // Update prefix XOR frequency in the map
               prefixXorCount.put(xor, prefixXorCount.getOrDefault(xor, 0) + 1);
          }
          return count;
     }

     public static void main(String[] args) {

     }
}