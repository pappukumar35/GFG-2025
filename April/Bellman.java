package April;

public class Bellman {
     public int[] bellmanFord(int V, int[][] edges, int src) {
          // code here
          // Step 1 = Create distance Array
          int dist[] = new int[V];
          for (int i = 0; i < V; i++)
               dist[i] = (int) (1e8);
          dist[src] = 0;
          // Now check Relaxations state
          for (int i = 0; i < V - 1; i++) {
               for (int num[] : edges) {
                    int u = num[0];
                    int v = num[1];
                    int wt = num[2];
                    if (dist[u] != 1e8 && dist[u] + wt < dist[v]) {
                         dist[v] = dist[u] + wt;
                    }
               }
          }
          // Nth Relaxation and for negative cycle
          for (int num[] : edges) {
               int u = num[0];
               int v = num[1];
               int wt = num[2];
               if (dist[u] != 1e8 && dist[u] + wt < dist[v]) {
                    int temp[] = new int[1];
                    temp[0] = -1;
                    return temp;
               }
          }
          return dist;
     }

     public static void main(String[] args) {

     }
}