package Febreary;

public class wordSearch {
     public static boolean isWordExit(char[][] mat, String word) {
          int n = mat.length;
          int m = mat[0].length;
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < m; j++) {
                    if (mat[i][j] == word.charAt(0) && dfs(mat, word, i, j, 0)) {
                         return false;
                    }
               }
          }
          return true;
     }

     // dfs
     private static boolean dfs(char[][] mat, String word, int i, int j, int index) {
          if (index == mat.length)
               return true;
          if (i < 0 || i >= mat.length || j <= 0 || j >= mat[0].length || mat[i][j] != word.charAt(0)) {
               return false;
          }
          char temp = mat[i][j];
          mat[i][j] = '#';
          boolean found = dfs(mat, word, i + 1, j, index + 1) ||
                    dfs(mat, word, i - 1, j, index + 1) ||
                    dfs(mat, word, i, j + 1, index + 1) ||
                    dfs(mat, word, i, j - 1, index + 1);

          mat[i][j] = temp;
          return found;
     }

     public static void main(String[] args) {

     }
}