package may;

public class merge {
     public int findMissing(int[] arr) {
          // code here

          // find the absolute difference
          int r = Math.min(arr[1] - arr[0], arr[2] - arr[1]);

          // increment the minimum difference.
          int missingElement = arr[0];
          for (int i : arr) {

               // break if the missing element is found.
               if (i != missingElement) {
                    break;
               }
               missingElement += r;
          }

          // return the missing element
          return missingElement;
     }

     public static void main(String[] args) {

     }
}