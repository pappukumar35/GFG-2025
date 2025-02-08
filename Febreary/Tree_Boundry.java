package Febreary;
import java.util.*;
public class Tree_Boundry{
     public static class Node
     {
         int data;
         Node left, right;
     
         public Node(int d)
         {
             data = d;
             left = right = null;
         }
     }
     ArrayList<Integer> boundaryTraversal(Node node) {
          ArrayList<Integer> result = new ArrayList<>();
          if (node == null) return result;
  
          // Add root (if it's not a leaf node)
          if (!isLeaf(node)) result.add(node.data);
  
          // Get Left Boundary
          addLeftBoundary(node.left, result);
  
          // Get Leaf Nodes
          addLeafNodes(node, result);
  
          // Get Right Boundary
          ArrayList<Integer> rightBoundary = new ArrayList<>();
          addRightBoundary(node.right, rightBoundary);
  
          // Add Right Boundary in reverse order
          Collections.reverse(rightBoundary);
          result.addAll(rightBoundary);
  
          return result;
      }
  
      private void addLeftBoundary(Node node, ArrayList<Integer> result) {
          while (node != null) {
              if (!isLeaf(node)) result.add(node.data);
              node = (node.left != null) ? node.left : node.right;
          }
      }
  
      private void addLeafNodes(Node node, ArrayList<Integer> result) {
          if (node == null) return;
          if (isLeaf(node)) {
              result.add(node.data);
              return;
          }
          addLeafNodes(node.left, result);
          addLeafNodes(node.right, result);
      }
  
      private void addRightBoundary(Node node, ArrayList<Integer> result) {
          while (node != null) {
              if (!isLeaf(node)) result.add(node.data);
              node = (node.right != null) ? node.right : node.left;
          }
      }
  
      private boolean isLeaf(Node node) {
          return (node.left == null && node.right == null);
      }
     public static void main(String args[]){

     }
}