package April;

public class island {
     public static void dfs(char[][] grid, int x, int y, boolean[][] visited) {
          int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
          int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };

          visited[x][y] = true;

          for (int dir = 0; dir < 8; dir++) {
               int newX = x + dx[dir];
               int newY = y + dy[dir];

               if (newX >= 0 && newY >= 0 && newX < grid.length && newY < grid[0].length &&
                         !visited[newX][newY] && grid[newX][newY] == 'L') {
                    dfs(grid, newX, newY, visited);
               }
          }
     }

     public static int countIslands(char[][] grid) {
          int n = grid.length;
          int m = grid[0].length;
          boolean[][] visited = new boolean[n][m];
          int count = 0;

          for (int i = 0; i < n; i++) {
               for (int j = 0; j < m; j++) {
                    if (!visited[i][j] && grid[i][j] == 'L') {
                         dfs(grid, i, j, visited);
                         count++;
                    }
               }
          }

          return count;
     }

     public static void main(String[] args) {

     }
}