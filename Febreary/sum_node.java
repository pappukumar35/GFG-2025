package Febreary;

import java.util.*;

public class sum_node {
     class Node {
          int data;
          Node left, right;

          Node(int d) {
               data = d;
               left = right = null;
          }
     }

     public int findMaxSum(Node root) {
          int[] res = new int[1];
          res[0] = Integer.MIN_VALUE;
          maxPathSumUtil(root, res);
          return res[0];
     }

     private int maxPathSumUtil(Node node, int[] res) {
          if (node == null) {
               return 0;
          }
          int left = Math.max(0, maxPathSumUtil(node.left, res));
          int right = Math.max(0, maxPathSumUtil(node.right, res));
          res[0] = Math.max(res[0], left + right + node.data);
          return node.data + Math.max(left, right);
     }

     public static void main(String args[]) {

     }
}