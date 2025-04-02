package April;

public class bfs {
     public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
          ArrayList<Integer> bfsTraversal = new ArrayList<>();
          Queue<Integer> queue = new LinkedList<>();
          boolean[] visited = new boolean[adj.size()];

          // Start BFS from vertex 0
          queue.add(0);
          visited[0] = true;

          while (!queue.isEmpty()) {
               int node = queue.poll();
               bfsTraversal.add(node);

               // Traverse neighbors in the given order
               for (int neighbor : adj.get(node)) {
                    if (!visited[neighbor]) {
                         queue.add(neighbor);
                         visited[neighbor] = true;
                    }
               }
          }

          return bfsTraversal;
     }

     public static void main(String[] args) {

     }
}