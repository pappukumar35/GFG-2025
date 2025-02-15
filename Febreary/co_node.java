package Febreary;

import java.util.*;

public class co_node {
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

     Node LCA(Node root, Node n1, Node n2) {
          // your code here.
          return (root.data > n1.data && root.data > n2.data) ? LCA(root.left, n1, n2)
                    : (root.data < n1.data && root.data < n2.data) ? LCA(root.right, n1, n2) : root;
     }

     public static void main(String[] args) {

     }
}