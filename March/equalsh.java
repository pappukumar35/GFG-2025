package March;

public class equalsh {
     static boolean f(int ind, int tar, int arr[], Boolean dp[][]) {
          if (ind < 0)
               return false;
          if (tar == 0)
               return true;

          if (dp[ind][tar] != null)
               return dp[ind][tar];

          boolean nt = f(ind - 1, tar, arr, dp);
          boolean t = false;
          if (tar - arr[ind] >= 0)
               t = f(ind - 1, tar - arr[ind], arr, dp);
          return dp[ind][tar] = nt || t;
     }

     static boolean equalPartition(int arr[]) {
          int sum = 0;
          for (int a : arr)
               sum += a;
          if (sum % 2 != 0)
               return false;
          int target = sum / 2;
          Boolean dp[][] = new Boolean[arr.length][target + 1];
          return f(arr.length - 1, target, arr, dp);

     }

     public static void main(String[] args) {

     }
}