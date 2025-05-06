package may;

import java.util.*;

public class leftview {
     void f(Node node, ArrayList<Integer> arr, int lvl) {
          if (node == null)
               return;
          if (arr.size() < lvl)
               arr.add(node.data);

          f(node.left, arr, lvl + 1);
          f(node.right, arr, lvl + 1);
     }

     ArrayList<Integer> leftView(Node root) {
          ArrayList<Integer> ans = new ArrayList<>();
          f(root, ans, 1);
          return ans;
     }

     public static void main(String[] args) {

     }
}