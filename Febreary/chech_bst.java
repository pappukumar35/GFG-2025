package Febreary;

import java.util.*;

public class chech_bst {

     public static class Node {
          int data;
          Node left;
          Node right;

          Node(int data) {
               this.data = data;
               this.left = left;
               this.right = right;
          }
     }

     boolean isBST(Node root) {
          return helper(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
     }

     Boolean helper(Node root, int max, int min) {
          if (root == null) {
               return true;
          }

          if (root.data < min || root.data > max) {
               return false;
          }

          return helper(root.left, root.data, min) && helper(root.right, max, root.data);

     }

     public static void main(String args[]) {

     }
}