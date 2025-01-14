package January;

public class Find_Equilibreaty {
     public static int findEquilibrium(int arr[]) {
          int n = arr.length;
          int prev = 0;
          int sum = 0;

          for (int i = 0; i < n; i++) {
               sum += arr[i];
          }

          for (int i = 0; i < n; i++) {
               sum -= arr[i];

               if (prev == sum) {
                    return i;
               }
               prev += arr[i];
          }

          return -1;
     }

     public static void main(String[] args) {

     }
}