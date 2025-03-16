package March;

public class jump {
     static int minJumps(int[] arr) {
          int n = arr.length;

          // If the array has only one element, no jump is needed
          if (n <= 1)
               return 0;

          // If the first element is 0, we can't move anywhere
          if (arr[0] == 0)
               return -1;

          // Initialize variables
          int jumps = 1; // At least one jump is needed initially
          int farthest = arr[0]; // Farthest we can reach
          int currEnd = arr[0]; // Current jump's range

          for (int i = 1; i < n; i++) {
               // If we've reached the last index, return jumps
               if (i == n - 1)
                    return jumps;

               // Update the farthest we can reach
               farthest = Math.max(farthest, i + arr[i]);

               // If we reach the end of the current jump range
               if (i == currEnd) {
                    jumps++;
                    currEnd = farthest;

                    // If the current range doesn't extend further, we can't proceed
                    if (currEnd <= i)
                         return -1;
               }
          }

          return -1; // If we exit the loop without reaching the last index
     }

     public static void main(String[] args) {

     }
}