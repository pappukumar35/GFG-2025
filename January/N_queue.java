package January;

import java.util.*;

public class N_queue {
     static ArrayList<ArrayList<Integer>> nQueen(int n) {
          // code here
          ArrayList<ArrayList<Integer>> result = new ArrayList<>();
          int[][] arr = new int[n][n];
          nQueens(arr, 0, result, n);
          return result;
     }

     static void nQueens(int[][] arr, int row, ArrayList<ArrayList<Integer>> result, int n) {
          if (row == arr.length) {
               // collect answers and reinitialize a to remove the current answer
               ArrayList<Integer> answer = new ArrayList<>();
               for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length; j++) {
                         if (arr[i][j] == 1)
                              answer.add(j + 1);
                    }
               }
               result.add(answer);
               arr = new int[n][n];
               return;
          }

          for (int col = 0; col < n; col++) {
               if (isSafe(arr, row, col)) {
                    arr[row][col] = 1;
                    nQueens(arr, row + 1, result, n);
                    arr[row][col] = 0;
               }
          }
     }

     public static boolean isSafe(int[][] arr, int row, int col) {
          // check up
          for (int i = row - 1; i >= 0; i--) {
               if (arr[i][col] == 1)
                    return false;
          }
          // check diagonals
          for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; j--, i--) {
               if (arr[i][j] == 1)
                    return false;
          }
          for (int i = row - 1, j = col + 1; i >= 0 && j < arr[0].length; j++, i--) {
               if (arr[i][j] == 1)
                    return false;
          }
          return true;
     }

     public static void main(String[] args) {

     }
}