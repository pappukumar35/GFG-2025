package may;

public class level {
     public ArrayList<Integer> findSpiral(Node root) {
          if (root == null)
               return new ArrayList<Integer>();

          ArrayList<Integer> arr = new ArrayList();
          Deque<Node> q = new ArrayDeque<>();
          q.addFirst(root);
          int level = 0;
          while (!q.isEmpty()) {
               int size = q.size();
               while (size-- > 0) {
                    if (level != 0 && level % 2 == 0) {
                         Node curr = q.pollLast();
                         arr.add(curr.data);
                         if (curr.right != null)
                              q.addFirst(curr.right);
                         if (curr.left != null)
                              q.addFirst(curr.left);

                    } else {
                         Node curr = q.pollFirst();

                         arr.add(curr.data);
                         if (curr.left != null)
                              q.addLast(curr.left);
                         if (curr.right != null)
                              q.addLast(curr.right);
                    }
               }
               level++;
          }
          return arr;
     }

     public static void main(String[] args) {

     }
}