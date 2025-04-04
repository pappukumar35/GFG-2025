package April;

public class graph {
     public boolean isCycle(int V, int[][] edges) {
          // Code here
          int[] parent = new int[V];
          for (int i = 0; i < V; i++) {
               parent[i] = i;
          }

          for (int[] edge : edges) {
               int u = edge[0];
               int v = edge[1];
               int parentU = find(parent, u);
               int parentV = find(parent, v);

               if (parentU == parentV) {
                    return true;
               }
               union(parent, parentU, parentV);
          }
          return false;
     }

     private int find(int[] parent, int vertex) {
          if (parent[vertex] != vertex) {
               parent[vertex] = find(parent, parent[vertex]);
          }
          return parent[vertex];
     }

     private void union(int[] parent, int u, int v) {
          parent[u] = v;
     }

     public static void main(String[] args) {

     }
}