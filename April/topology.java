package April;
public class topology{
     public static void topoSortUtil(ArrayList<ArrayList<Integer>> adj,int crr,boolean[] vis,ArrayList<Integer> list){
          vis[crr]=true;
          for(int nighbor : adj.get(crr)){
              if(!vis[nighbor]){
                  topoSortUtil(adj,nighbor,vis,list);
              }
          }
          list.add(crr);
      }
      public static ArrayList<Integer> topoSort(int V, int[][] edges) {
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
         for(int i=0 ;i<V;i++){
             adj.add(new ArrayList<>());
         }
         for (int[] edge : edges) {
              adj.get(edge[0]).add(edge[1]);
          }
          
          boolean[] vis = new boolean[V];
          ArrayList<Integer> list = new ArrayList<>();
          for(int i=0;i<V;i++){
              if(!vis[i]){
                  topoSortUtil(adj,i,vis,list);
              }
          }
           Collections.reverse(list);
           return list;
      }
     public static void main(String[] args) {
          
     }
}