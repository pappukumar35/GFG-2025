package may;
public class much{
      private static Node mapParents(Node root, Map<Node, Node> parentMap, int target, Node[] targetNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        parentMap.put(root, null);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.data == target) {
                targetNode[0] = current;
            }

            if (current.left != null) {
                parentMap.put(current.left, current);
                queue.add(current.left);
            }

            if (current.right != null) {
                parentMap.put(current.right, current);
                queue.add(current.right);
            }
        }
        return targetNode[0];
    }

    public static int minTime(Node root, int target) {
        // Step 1: Map node to parent and find the target node
        Map<Node, Node> parentMap = new HashMap<>();
        Node[] targetNode = new Node[1];
        Node targetRef = mapParents(root, parentMap, target, targetNode);

        // Step 2: BFS from the target node
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        queue.add(targetRef);
        visited.add(targetRef);

        int time = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean burned = false;

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                // Spread to left
                if (current.left != null && !visited.contains(current.left)) {
                    queue.add(current.left);
                    visited.add(current.left);
                    burned = true;
                }

                // Spread to right
                if (current.right != null && !visited.contains(current.right)) {
                    queue.add(current.right);
                    visited.add(current.right);
                    burned = true;
                }

                // Spread to parent
                Node parent = parentMap.get(current);
                if (parent != null && !visited.contains(parent)) {
                    queue.add(parent);
                    visited.add(parent);
                    burned = true;
                }
            }

            if (burned) {
                time++;
            }
        }

        return time;
    }
     public static void main(String[] args) {
          
     }
}