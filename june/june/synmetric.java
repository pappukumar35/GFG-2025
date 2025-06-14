package june;

public class synmetric {
     boolean f(Node n1, Node n2) {
          if (n1 == null && n2 == null)
               return true;
          if (n1 == null || n2 == null)
               return false;

          if (f(n1.left, n2.right) == false)
               return false;
          if (f(n1.right, n2.left) == false)
               return false;

          if (n1.data != n2.data)
               return false;
          if (n1.data != n2.data)
               return false;
          return true;
     }

     public boolean isSymmetric(Node root) {

          return f(root, root);
     }

     public static void main(String[] args) {

     }
}