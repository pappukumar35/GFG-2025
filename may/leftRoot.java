package may;

public class leftRoot {
     public static ArrayList<ArrayList<Integer>> Paths(Node root) {
          ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
          ArrayList<Integer> path = new ArrayList<>();
          solve(root, ans, path);
          return ans;
     }

     public static void solve(Node root, ArrayList<ArrayList<Integer>> ans,
               ArrayList<Integer> path) {
          if (root == null)
               return;

          path.add(root.data);

          if (root.left == null && root.right == null) {
               ans.add(new ArrayList<>(path));
          }

          solve(root.left, ans, path);
          solve(root.right, ans, path);

          // Backtrack
          path.remove(path.size() - 1);
     }

     public static void main(String[] args) {

     }
}