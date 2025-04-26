package April;

public class binary {
     boolean isHeap(Node tree) {
          // code here
          Queue<Node> q = new LinkedList<>();
          q.add(tree);
          while (!q.isEmpty()) {
               int n = q.size();
               boolean nullChild = false;
               for (int i = 0; i < n; i++) {
                    Node node = q.poll();

                    if (node.left != null) {
                         if (nullChild)
                              return false;
                         if (node.data < node.left.data)
                              return false;
                         q.add(node.left);
                    } else
                         nullChild = true;

                    if (node.right != null) {
                         if (nullChild)
                              return false;
                         if (node.data < node.right.data)
                              return false;
                         q.add(node.right);
                    } else
                         nullChild = true;
               }
          }
          return true;
     }

     public static void main(String[] args) {

     }
}